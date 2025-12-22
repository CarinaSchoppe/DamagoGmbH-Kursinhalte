package fi15ae.kw51.tag4.erklaerungen.state;


public interface PlayerState {


  void onMoveRight(Player player);

  void onStop(Player player);

  void onJump(Player player);

  void onLand(Player player);

  String name();


}