package tag2.factory;

public abstract class Showroom {


  public void ausstellen(){
    Fahrzeug fahrenzeug = fahrzeugEinkaufen();
    fahrenzeug.einschalten();
  }

  public abstract Fahrzeug fahrzeugEinkaufen();


}