package tag4.aufgaben.state.infrastrucure.states;

import tag4.aufgaben.state.application.PlayerState;
import tag4.aufgaben.state.domain.Player;

public class CombatState implements PlayerState {


  private static final int COMBAT_TICKS = 5;
  private static final int STUN_DAMAGE_THRESHOLD = 8;

  @Override
  public String name() {
    return "COMBAT";
  }

  @Override
  public void onMove(Player player) {
    System.out.println("[COMBAT] " + player.getName() + " moved");
  }

  @Override
  public void onAttack(Player player) {
    System.out.println("[COMBAT] " + player.getName() + " attacks");
    player.getStats().resetCombat(COMBAT_TICKS);
  }

  @Override
  public void onPlaceBlock(Player player) {
    //cant build during
    System.out.println("[COMBAT] " + player.getName() + " cant place during fights!");
  }

  @Override
  public void onTakeDamage(Player player, int amount) {
    player.getStats().damage(amount);

    if (player.getStats().isDead()) {
      player.die();
      return;
    }


    player.getStats().resetCombat(COMBAT_TICKS);
    if (amount >= STUN_DAMAGE_THRESHOLD) {
      player.setState(new StunState(new CombatState(), 2));
    }
  }

  @Override
  public void onHeal(Player player, int amount) {
    int effective = amount / 2;

    if (amount > 0 && effective == 0) {
      effective = 1;
    }

    player.getStats().heal(effective);
    System.out.println("[COMBAT] " + player.getName() + " healed for " + effective + "(health=" +
        player.getStats().getHealth() + ")");
  }

  @Override
  public void onTick(Player player) {
    player.getStats().decrementCombatTick();
    if (player.getStats().getCombatTicksLeft() <= 0) {
      player.setState(new SurvivalState());
    }
  }

  @Override
  public void onDie(Player player) {
    player.setState(new DeadState());
  }

  @Override
  public void onRespawn(Player player) {
    System.out.println("[COMBAT] " + player.getName() + " already alive");
  }

  @Override
  public void onToggleBuildMode(Player player) {
    System.out.println("Finish your combat first!");
  }
}