package fi15ae.kw52.tag1.andererkram;

import fi15ae.kw51.tag4.aufgaben.iterator.domain.Point;

public class Game {


  static void main(String[] args) {
    var player = new Player("Carina", new Point(1, 2, 3), 20, 100, 10, 3, true, false);
    System.out.println(player.toJson());
  }
}
