package fi15ae.kw51.tag4.erklaerungen.iterator.infrastructure;

import fi15ae.kw51.tag4.erklaerungen.iterator.application.TourIterator;
import fi15ae.kw51.tag4.erklaerungen.iterator.domain.Stop;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GuideIterator implements TourIterator {


  private final List<Stop> stops;

  private int index = 0;

  public GuideIterator(List<Stop> stops) {
    this.stops = new ArrayList<>(stops);
    //order the stops based on their ID in the preferences list
    this.stops.sort(Comparator.comparingInt(Stop::id));
  }

  @Override
  public boolean hasNext() {
    return index < stops.size();
  }

  @Override
  public Stop next() {
    return stops.get(index++);
  }


}