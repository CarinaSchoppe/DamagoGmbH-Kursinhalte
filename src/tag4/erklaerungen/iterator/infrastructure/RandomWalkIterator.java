package tag4.erklaerungen.iterator.infrastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import tag4.erklaerungen.iterator.application.TourIterator;
import tag4.erklaerungen.iterator.domain.Stop;

public class RandomWalkIterator implements TourIterator {


  private final List<Stop> remaining;
  private final Random random;

  public RandomWalkIterator(List<Stop> stops, long seed) {
    this.remaining = new ArrayList<>(stops);
    this.random = new Random(seed);
  }

  @Override
  public boolean hasNext() {
    return !remaining.isEmpty();
  }

  @Override
  public Stop next() {
    int i = random.nextInt(remaining.size());
    return remaining.remove(i);
  }
}