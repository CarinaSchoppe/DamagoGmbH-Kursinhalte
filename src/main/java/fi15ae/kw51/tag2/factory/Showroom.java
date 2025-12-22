package fi15ae.kw51.tag2.factory;

public abstract class Showroom {


  public void ausstellen(){
    Fahrzeug fahrenzeug = fahrzeugEinkaufen();
    fahrenzeug.einschalten();
  }

  public abstract Fahrzeug fahrzeugEinkaufen();


}