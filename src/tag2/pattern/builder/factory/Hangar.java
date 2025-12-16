package tag2.pattern.builder.factory;

public class Hangar extends Showroom{
  @Override
  public Fahrzeug fahrzeugEinkaufen() {
    return new Flugzeug();
  }
}