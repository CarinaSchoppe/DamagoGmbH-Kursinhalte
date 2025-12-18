package tag4.erklaerungen.state;

public class Main {

  static void main() {

    var player = new Player();

    player.moveRight();
    player.moveRight();
    player.moveRight();
    player.jump();
    player.jump();
    player.land();
    player.moveRight();
    player.stop();

  }

}