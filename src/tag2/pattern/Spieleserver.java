package tag2.pattern;

public class Spieleserver {


  private static Spieleserver instance;

  private Spieleserver() {
  }

  public static Spieleserver erstelleInstance() {
    if (instance == null) {
      instance = new Spieleserver();
    }
    return instance;
  }
}