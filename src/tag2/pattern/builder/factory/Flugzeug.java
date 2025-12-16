package tag2.pattern.builder.factory;

public class Flugzeug implements Fahrzeug{
  @Override
  public void einsteigen() {
    System.out.println("LETZTER AUFRUF");
  }

  @Override
  public void transportieren() {
    System.out.println("NEWWWWWW");
  }

  @Override
  public void einschalten() {
    System.out.println("PFSSCHHHHHHHHHH");
  }
}