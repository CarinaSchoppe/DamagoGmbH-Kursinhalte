package fi15ae.kw51.tag4.aufgaben.iterator.infrastructure;

import fi15ae.kw51.tag4.aufgaben.iterator.application.TourIterator;
import fi15ae.kw51.tag4.aufgaben.iterator.domain.Stop;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomWalkIterator extends Iterator implements TourIterator {


  private final Random random;

  public RandomWalkIterator(List<Stop> stops, long seed) {
    super(new ArrayList<>(stops));
    this.random = new Random(seed);
  }

  @Override
  public boolean hasNext() {
    return !stops.isEmpty();
  }

  @Override
  public Stop next() {
    int i = random.nextInt(stops.size());
    return stops.remove(i);
  }
}