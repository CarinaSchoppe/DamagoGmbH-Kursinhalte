package fi15ae.kw51.tag4.aufgaben.iterator.application;

import fi15ae.kw51.tag4.aufgaben.iterator.domain.Stop;
import fi15ae.kw51.tag4.aufgaben.iterator.infrastructure.GuideIterator;
import fi15ae.kw51.tag4.aufgaben.iterator.infrastructure.MapsIterator;
import fi15ae.kw51.tag4.aufgaben.iterator.infrastructure.RandomWalkIterator;
import java.util.List;

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