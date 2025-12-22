package fi15ae.kw51.tag4.aufgaben.state.application;


import fi15ae.kw51.tag4.aufgaben.state.domain.Player;

public class GameLoop {


  public void runTicks(Player player, int ticks) {
    for (int i = 1; i <= ticks; i++) {

      System.out.println("Tick: " + i);
      player.tick();
    }
  }

}