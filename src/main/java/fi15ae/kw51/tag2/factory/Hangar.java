package fi15ae.kw51.tag2.factory;

public class Hangar extends Showroom{
  @Override
  public Fahrzeug fahrzeugEinkaufen() {
    return new Flugzeug();
  }
}