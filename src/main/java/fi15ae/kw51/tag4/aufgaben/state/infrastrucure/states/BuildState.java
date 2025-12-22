package fi15ae.kw51.tag4.aufgaben.state.infrastrucure.states;

import fi15ae.kw51.tag4.aufgaben.state.application.PlayerState;
import fi15ae.kw51.tag4.aufgaben.state.domain.Player;

public class BuildState implements PlayerState {


  private static final int COMBAT_TICKS = 5;
  private static final int STUN_DAMAGE_THRESHOLD = 8;

  @Override
  public String name() {
    return "BUILD";
  }

  @Override
  public void onMove(Player player) {
    System.out.println("[BUILD] " + player.getName() + " moves");
  }

  @Override
  public void onAttack(Player player) {
    System.out.println("[BUILD] " + player.getName() + " cant Attack");
  }

  @Override
  public void onPlaceBlock(Player player) {
    System.out.println("[BUILD] " + player.getName() + " places block");
  }

  @Override
  public void onTakeDamage(Player player, int amount) {
    player.getStats().damage(amount);
    if (player.getStats().isDead()) {
      player.die();
      return;
    }

    player.getStats().startCombat(COMBAT_TICKS);


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
        "[BUILD] " + player.getName() + " healed to " + player.getStats().getHealth());
  }

  @Override
  public void onTick(Player player) {
//nichts
  }

  @Override
  public void onDie(Player player) {
    player.setState(new DeadState());
  }

  @Override
  public void onRespawn(Player player) {
    System.out.println("[BUILD] " + player.getName() + " already alive!");
  }

  @Override
  public void onToggleBuildMode(Player player) {
    player.setState(new SurvivalState());
  }
}