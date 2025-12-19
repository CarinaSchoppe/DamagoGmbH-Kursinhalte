package tag4.aufgaben.iterator.infrastructure;

import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;
import tag4.aufgaben.iterator.domain.Stop;

public abstract class Iterator {


  protected List<Stop> stops;

  public Iterator(List<Stop> stops) {
    this.stops = stops;


    var list = new ArrayList<>();


    for (var a : list) {


      var arm = "Kamera";   //<--- erstelle eine variable mit wert Hallo x -> "Hallo"
      arm = "Cola Flasche";    // <--- nimm den X Zeiger


      var server = new ServerSocket();


    }

  }
}