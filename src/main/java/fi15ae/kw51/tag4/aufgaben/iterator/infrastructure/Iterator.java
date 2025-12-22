package fi15ae.kw51.tag4.aufgaben.iterator.infrastructure;

import fi15ae.kw51.tag4.aufgaben.iterator.domain.Stop;
import java.util.ArrayList;
import java.util.List;

public abstract class Iterator {


  protected List<Stop> stops;

  public Iterator(List<Stop> stops) {
    this.stops = stops;


    var list = new ArrayList<>();


    for (var a : list) {


      var arm = "Kamera";   //<--- erstelle eine variable mit wert Hallo x -> "Hallo"
      arm = "Cola Flasche";    // <--- nimm den X Zeiger


    }

  }
}