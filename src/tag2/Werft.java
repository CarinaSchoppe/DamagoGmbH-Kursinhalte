package tag2;

import tag2.pattern.builder.factory.Fahrzeug;
import tag2.pattern.builder.factory.Showroom;

public class Werft extends Showroom {
  @Override
  public Fahrzeug fahrzeugEinkaufen() {
    return null;
  }
}