package tag4.aufgaben.state.presentation;

import tag4.aufgaben.state.application.GameLoop;
import tag4.aufgaben.state.domain.Player;
import tag4.aufgaben.state.domain.PlayerStats;
import tag4.aufgaben.state.infrastrucure.ConsoleLogger;
import tag4.aufgaben.state.infrastrucure.states.SpectatorState;
import tag4.aufgaben.state.infrastrucure.states.SurvivalState;

public class Main {


  static void main() {

    ConsoleLogger logger = new ConsoleLogger();

    Player player = new Player("Steve", new PlayerStats(20, 20), new SurvivalState(), logger::info);


    player.move();
    player.toggleBuildMode();
    player.placeBlock();
    player.attack();
    player.takeDamage(4);
    player.attack();
    player.placeBlock();


    GameLoop loop = new GameLoop();

    loop.runTicks(player, 6);
    player.toggleBuildMode();
    player.takeDamage(30);

    player.move();
    player.respawn();
    player.move();


    System.out.println("ADMIN SPECTATOR MODE ON");
    adminSetSpectator(player, true);

    player.move();
    player.placeBlock();

    System.out.println("ADMIN SPECTATOR MODE OFF");
    adminSetSpectator(player, false);
    player.move();
  }

  private static void adminSetSpectator(Player player, boolean enabled) {
    if (player.getStats().isDead()) {
      System.out.println("[ADMIN] Cannot set spectator mode, player is dead");
      return;

    }

    if (enabled) {
      player.setState(new SpectatorState());
    } else {
      player.setState(new SurvivalState());
    }
  }
}