package tag2.pattern.builder.factory;

public abstract class Showroom {


  public void ausstellen(){
    Fahrzeug fahrenzeug = fahrzeugEinkaufen();
    fahrenzeug.einschalten();
  }

  public abstract Fahrzeug fahrzeugEinkaufen();


}