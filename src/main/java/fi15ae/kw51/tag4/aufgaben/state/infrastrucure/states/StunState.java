package fi15ae.kw51.tag4.aufgaben.state.infrastrucure.states;

import fi15ae.kw51.tag4.aufgaben.state.application.PlayerState;
import fi15ae.kw51.tag4.aufgaben.state.domain.Player;

public class StunState implements PlayerState {


  private PlayerState returnState;
  private int ticksLeft;

  public StunState(PlayerState returnState, int ticksLeft) {
    this.returnState = returnState;
    this.ticksLeft = Math.max(1, ticksLeft);
  }

  @Override
  public String name() {
    return "STUN";
  }

  @Override
  public void onMove(Player player) {
    System.out.println("[STUN] " + player.getName() + " can not move");
  }

  @Override
  public void onAttack(Player player) {
    System.out.println("[STUN] " + player.getName() + " can not attack");
  }

  @Override
  public void onPlaceBlock(Player player) {
    System.out.println("[STUN] " + player.getName() + " can not place block");
  }

  @Override
  public void onTakeDamage(Player player, int amount) {
    player.getStats().damage(amount);
    if (player.getStats().isDead()) {
      player.die();
      return;
    }

    this.ticksLeft = 2;

    player.getStats().resetCombat(5);
    this.returnState = new CombatState();
  }

  @Override
  public void onHeal(Player player, int amount) {
    System.out.println("[STUN] " + player.getName() + " can not heal");
  }

  @Override
  public void onTick(Player player) {
    ticksLeft--;
    if (ticksLeft <= 0) {
      player.setState(returnState);
    }
  }

  @Override
  public void onDie(Player player) {
    player.setState(new DeadState());
  }

  @Override
  public void onRespawn(Player player) {
    System.out.println("[STUN] " + player.getName() + " already alive");
  }

  @Override
  public void onToggleBuildMode(Player player) {
    System.out.println("[STUN] " + player.getName() + " can not toggle build mode");
  }
}