package tag4.aufgaben.state.application;

import tag4.aufgaben.state.domain.Player;

public interface PlayerState {

  String name();

  void onMove(Player player);

  void onAttack(Player player);

  void onPlaceBlock(Player player);

  void onTakeDamage(Player player, int amount);

  void onHeal(Player player, int amount);

  void onTick(Player player);

  void onDie(Player player);

  void onRespawn(Player player);

  void onToggleBuildMode(Player player);


}