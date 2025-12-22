package fi15ae.kw51.tag4.aufgaben.iterator.infrastructure;

import fi15ae.kw51.tag4.aufgaben.iterator.application.TourIterator;
import fi15ae.kw51.tag4.aufgaben.iterator.domain.Stop;
import java.util.List;

public class MapsIterator extends Iterator implements TourIterator {

  private int index;

  public MapsIterator(List<Stop> stops) {
    super(stops);
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