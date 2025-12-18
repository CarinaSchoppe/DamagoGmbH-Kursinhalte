package tag4.erklaerungen.iterator.infrastructure;

import java.util.List;
import tag4.erklaerungen.iterator.application.TourIterator;
import tag4.erklaerungen.iterator.domain.Stop;

public class MapsIterator implements TourIterator {

  private final List<Stop> stops;
  private int index;

  public MapsIterator(List<Stop> stops) {
    this.stops = stops;
    this.index = stops.size() - 1;
  }

  @Override
  public boolean hasNext() {
    return index >= 0;
  }

  @Override
  public Stop next() {
    return stops.get(index--);
  }
}