package fi15ae.kw51.tag4.aufgaben.state.infrastrucure.states;

import fi15ae.kw51.tag4.aufgaben.state.application.PlayerState;
import fi15ae.kw51.tag4.aufgaben.state.domain.Player;

public class DeadState implements PlayerState {
  @Override
  public String name() {
    return "DEAD";
  }

  @Override
  public void onMove(Player player) {
    System.out.println("[DEAD] " + player.getName() + " can not move");
  }

  @Override
  public void onAttack(Player player) {
    System.out.println("[DEAD] " + player.getName() + " can not attack");
  }

  @Override
  public void onPlaceBlock(Player player) {
    System.out.println("[DEAD] " + player.getName() + " can not place block");
  }

  @Override
  public void onTakeDamage(Player player, int amount) {
    System.out.println("[DEAD] " + player.getName() + " can not take damage");
  }

  @Override
  public void onHeal(Player player, int amount) {
    System.out.println("[DEAD] " + player.getName() + " can not heal");
  }

  @Override
  public void onTick(Player player) {
  }

  @Override
  public void onDie(Player player) {
    System.out.println("[DEAD] " + player.getName() + " already dead");
  }

  @Override
  public void onRespawn(Player player) {
    player.getStats().setHealth(20);
    player.getStats().startCombat(0);
    player.setState(new SurvivalState());
  }

  @Override
  public void onToggleBuildMode(Player player) {
    System.out.println("[DEAD] can not toggle build mode");
  }
}