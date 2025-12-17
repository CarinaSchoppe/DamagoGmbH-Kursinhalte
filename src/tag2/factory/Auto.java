package tag2.factory;

public class Auto implements Fahrzeug{
  @Override
  public void einsteigen() {
    System.out.println("Türen auf");
  }

  @Override
  public void transportieren() {
    System.out.println("Brum brum");
  }

  @Override
  public void einschalten() {
    System.out.println("BRRRTTRRZRZZZRZRZRZZR");
  }
}