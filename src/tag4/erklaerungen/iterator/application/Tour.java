package tag4.erklaerungen.iterator.application;

import java.util.List;
import tag4.erklaerungen.iterator.domain.Stop;
import tag4.erklaerungen.iterator.infrastructure.GuideIterator;
import tag4.erklaerungen.iterator.infrastructure.MapsIterator;
import tag4.erklaerungen.iterator.infrastructure.RandomWalkIterator;

public record Tour(List<Stop> stops) {


  public TourIterator guideIterator() {
    return new GuideIterator(stops);
  }

  public TourIterator mapsIterator() {
    return new MapsIterator(stops);
  }

  public TourIterator randomWalkIterator(long seed) {
    return new RandomWalkIterator(stops, seed);
  }
}