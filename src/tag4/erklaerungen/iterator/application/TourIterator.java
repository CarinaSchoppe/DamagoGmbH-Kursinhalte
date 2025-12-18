package tag4.erklaerungen.iterator.application;

import tag4.erklaerungen.iterator.domain.Stop;

public interface TourIterator {

  boolean hasNext();

  Stop next();

}