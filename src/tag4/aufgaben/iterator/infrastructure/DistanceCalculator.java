package tag4.aufgaben.iterator.infrastructure;

import tag4.aufgaben.iterator.domain.Point;

public class DistanceCalculator {

  public static double calculateDistance(Point p1, Point p2) {
    return Math.sqrt(
        Math.pow(p2.x() - p1.x(), 2) + Math.pow(p2.y() - p1.y(), 2) + Math.pow(p2.z() - p1.z(), 2));
  }

}