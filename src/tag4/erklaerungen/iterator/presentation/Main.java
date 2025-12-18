package tag4.erklaerungen.iterator.presentation;

import java.util.List;
import tag4.erklaerungen.iterator.application.Tour;
import tag4.erklaerungen.iterator.application.TourIterator;
import tag4.erklaerungen.iterator.domain.Stop;

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


    for (Stop stop : rom) {

    }
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