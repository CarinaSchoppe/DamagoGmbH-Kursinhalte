package tag4.aufgaben.iterator.infrastructure;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import tag4.aufgaben.iterator.application.TourIterator;
import tag4.aufgaben.iterator.domain.Stop;

public class GuideIterator extends Iterator implements TourIterator {


  private int index = 0;

  public GuideIterator(List<Stop> stops) {
    super(new ArrayList<>(stops));
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