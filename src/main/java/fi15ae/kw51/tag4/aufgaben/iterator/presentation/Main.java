package fi15ae.kw51.tag4.aufgaben.iterator.presentation;

import fi15ae.kw51.tag4.aufgaben.iterator.application.Tour;
import fi15ae.kw51.tag4.aufgaben.iterator.application.TourIterator;
import fi15ae.kw51.tag4.aufgaben.iterator.domain.Stop;
import java.util.List;

public class Main {

  static void main() {

    List<Stop> rom = List.of(
        new Stop("Kolosseum", 3),
        new Stop("Forum Romanum", 1),
        new Stop("Trevi-Brunnen", 5),
        new Stop("Pantheon", 2),
        new Stop("Piazza Navona", 4)
    );

    List<Stop> paris = List.of(
        new Stop("Eiffelturm", 3),
        new Stop("Louvre", 1),
        new Stop("Notre-Dame", 2),
        new Stop("Montmartre", 5),
        new Stop("Champs-Élysées", 4)
    );


    Tour romTour = new Tour(rom);
    runTour("Guide", romTour.guideIterator());
    runTour("Maps", romTour.mapsIterator());
    runTour("Random Walk", romTour.randomWalkIterator(1234));

    Tour parisTour = new Tour(paris);
    runTour("Guide", parisTour.guideIterator());
    runTour("Maps", parisTour.mapsIterator());
    runTour("Random Walk", parisTour.randomWalkIterator(3533424));

  }

  private static void runTour(String label, TourIterator iterator) {
    System.out.println("===" + label + "===");
    while (iterator.hasNext()) {
      Stop stop = iterator.next();
      System.out.println("Next Stop: " + stop.name());
    }

    System.out.println();
  }
}