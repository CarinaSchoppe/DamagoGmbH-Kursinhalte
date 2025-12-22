package fi15ae.kw51.tag4.aufgaben.state.infrastrucure.states;

import fi15ae.kw51.tag4.aufgaben.state.application.PlayerState;
import fi15ae.kw51.tag4.aufgaben.state.domain.Player;

public class SpectatorState implements PlayerState {
  @Override
  public String name() {
    return "SPECTATOR";
  }

  @Override
  public void onMove(Player player) {
    System.out.println("[SPECTATOR] " + player.getName() + " flies");
  }

  @Override
  public void onAttack(Player player) {
    System.out.println("[SPECTATOR] " + player.getName() + " can not attack");
  }

  @Override
  public void onPlaceBlock(Player player) {
    System.out.println("[SPECTATOR] " + player.getName() + " can not place block");
  }

  @Override
  public void onTakeDamage(Player player, int amount) {
    System.out.println("[SPECTATOR] " + player.getName() + " can not take damage");
  }

  @Override
  public void onHeal(Player player, int amount) {
    System.out.println("[SPECTATOR] " + player.getName() + " can not heal");
  }

  @Override
  public void onTick(Player player) {
  }

  @Override
  public void onDie(Player player) {
    player.setState(new DeadState());
  }

  @Override
  public void onRespawn(Player player) {
    System.out.println("[SPECTATOR] " + player.getName() + " already alive");
  }

  @Override
  public void onToggleBuildMode(Player player) {
    System.out.println("[SPECTATOR] " + player.getName() + " can not toggle build mode");
  }
}