package tag4.aufgaben.state.infrastrucure.states;

import tag4.aufgaben.state.application.PlayerState;
import tag4.aufgaben.state.domain.Player;

public class SurvivalState implements PlayerState {


  private static final int COMBAT_TICKS = 5;
  private static final int STUN_DAMAGE_THRESHOLD = 8; //<- BONUS C

  @Override
  public String name() {
    return "SURVIVAL";
  }

  @Override
  public void onMove(Player player) {
    System.out.println("[SURVIVAL] " + player.getName() + " moves");
  }

  @Override
  public void onAttack(Player player) {
    player.getStats().startCombat(COMBAT_TICKS);
    player.setState(new CombatState());
  }

  @Override
  public void onPlaceBlock(Player player) {
    System.out.println("[SURVIVAL] " + player.getName() + " places block");
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
      return;
    }

    player.setState(new CombatState());
  }

  @Override
  public void onHeal(Player player, int amount) {
    player.getStats().heal(amount);
    System.out.println(
        "[SURVIVAL] " + player.getName() + " healed for " + player.getStats().getHealth());
  }

  @Override
  public void onTick(Player player) {
    if (player.getStats().getCombatTicksLeft() > 0) {
      player.getStats().decrementCombatTick();
    }
  }

  @Override
  public void onDie(Player player) {
    player.setState(new DeadState());
  }

  @Override
  public void onRespawn(Player player) {
    System.out.println("[SURVIVAL] " + player.getName() + " already alive");
  }

  @Override
  public void onToggleBuildMode(Player player) {
    player.setState(new BuildState());
  }
}