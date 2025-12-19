package tag4.aufgaben.iterator.infrastructure;

import java.util.List;
import tag4.aufgaben.iterator.application.TourIterator;
import tag4.aufgaben.iterator.domain.Stop;

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