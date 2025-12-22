package fi15ae.kw51.tag2.factory;

public class AutoHaus extends Showroom{
  @Override
  public Fahrzeug fahrzeugEinkaufen() {
    return new Auto();
  }
}