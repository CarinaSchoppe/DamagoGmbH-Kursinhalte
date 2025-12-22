package fi15ae.kw51.tag4.aufgaben.iterator.infrastructure;

import fi15ae.kw51.tag4.aufgaben.iterator.application.TourIterator;
import fi15ae.kw51.tag4.aufgaben.iterator.domain.Point;
import fi15ae.kw51.tag4.aufgaben.iterator.domain.Stop;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DistanceIterator extends Iterator implements TourIterator {


  private Point position;

  public DistanceIterator(List<fi15ae.kw51.tag4.aufgaben.iterator.domain.Stop> stops,
                          Point position) {
    super(new ArrayList<>(stops));

    this.position = position;
  }

  @Override
  public boolean hasNext() {
    return stops.isEmpty();
  }

  @Override
  public Stop next() {
    if (stops.isEmpty()) {
      return null;
    }

    //find the Stop that is the closest to the current position
    stops.sort(Comparator.comparingDouble(stop -> DistanceCalculator.calculateDistance(position,
        stop.point())));

    var next = stops.removeFirst();
    position = next.point();
    return next;
  }
}