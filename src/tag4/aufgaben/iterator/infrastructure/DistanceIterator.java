package tag4.aufgaben.iterator.infrastructure;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import tag4.aufgaben.iterator.application.TourIterator;
import tag4.aufgaben.iterator.domain.Point;
import tag4.aufgaben.iterator.domain.Stop;

public class DistanceIterator extends Iterator implements TourIterator {


  private Point position;

  public DistanceIterator(List<tag4.aufgaben.iterator.domain.Stop> stops, Point position) {
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