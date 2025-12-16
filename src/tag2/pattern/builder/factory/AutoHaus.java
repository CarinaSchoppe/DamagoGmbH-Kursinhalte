package tag2.pattern.builder.factory;

public class AutoHaus extends Showroom{
  @Override
  public Fahrzeug fahrzeugEinkaufen() {
    return new Auto();
  }
}