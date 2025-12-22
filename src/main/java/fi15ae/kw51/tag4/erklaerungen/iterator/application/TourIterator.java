package fi15ae.kw51.tag4.erklaerungen.iterator.application;

import fi15ae.kw51.tag4.erklaerungen.iterator.domain.Stop;

public interface TourIterator {

  boolean hasNext();

  Stop next();

}