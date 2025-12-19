package tag4.aufgaben.state.application;


import tag4.aufgaben.state.domain.Player;

public class GameLoop {


  public void runTicks(Player player, int ticks) {
    for (int i = 1; i <= ticks; i++) {

      System.out.println("Tick: " + i);
      player.tick();
    }
  }

}