package fi15ae.kw51.tag4.erklaerungen.iterator.infrastructure;

import fi15ae.kw51.tag4.erklaerungen.iterator.application.TourIterator;
import fi15ae.kw51.tag4.erklaerungen.iterator.domain.Stop;
import java.util.List;

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