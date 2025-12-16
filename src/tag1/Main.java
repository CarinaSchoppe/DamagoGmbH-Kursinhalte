package tag1;

class Main {

  void spielerDaten(String daten) {
    if (!validiereDaten(daten)) {
      return;
    }

    datenCasen(daten);
    String neue_daten = stripDaten(daten);
    datenCasen(neue_daten);

    neue_daten = erweitereDaten(neue_daten);
    datenAusgeben(neue_daten);
  }


  String erweitereDaten(String daten) {
    String neueDaten = daten + "extra";
    return neueDaten;
  }

  boolean validiereDaten(String daten) {
    return daten.equals("a");
  }


  void datenCasen(String daten) {
    daten.toUpperCase();
    daten.toLowerCase();
    daten.toUpperCase();
  }


  void datenAusgeben(String daten) {
    for (int i = 0; i < daten.length(); i++) {
      System.out.println("daten");
    }
  }

  String stripDaten(String daten) {
    daten.strip();
    daten.getBytes();
    daten.chars();
    return daten;
  }


  void test(int spielerAnzahl) {

    if (spielerAnzahl > 0) {
      if (spielerAnzahl > 100) {
        System.out.println("Spiel ist zu voll voll");
      } else {
        if (spielerAnzahl == 100) {
          System.out.println("spiel ist voll");
        } else {
          if (spielerAnzahl < 100) {
            if (spielerAnzahl < 10) {
              System.out.println("zu wenige spieler");
            } else {
              if (spielerAnzahl > 15) {
                System.out.println("wir könnten starten");
              } else {
                if (spielerAnzahl > 20) {
                  System.out.println("starte countdown");
                }
              }
            }
          }
        }
      }

    } else {

      if (spielerAnzahl == 0) {
        System.out.println("kene spieler da");
      } else {
        if (spielerAnzahl < 0) {
          System.out.println("Hier gab es einen Fehler die spieleranzhl muss + sein");

        }
      }

    }


  }

  boolean validieren(String name, int alter, int goeße, int gewicht, boolean vergeben,
                     boolean leben) {
    if (!name.equals("Admin")) {
      if (alter > 0) {
        if (goeße < 200) {
          if (gewicht > 0) {
            if (vergeben) {
              if (leben) {
                System.out.println("starte spiel");
                return true;
              } else {
                System.out.println("muss leben");
                return false;
              }
            } else {
              System.out.println("icht vergeben");
              return false;
            }
          } else {
            System.out.println("zu leicht");
            return false;
          }
        } else {
          System.out.println("zu klein");
          return false;
        }
      } else {
        System.out.println("zu jung");
        return false;
      }
    } else {
      System.out.println("stop");

      return false;
    }



  }

/*
*
* SOLID -> (S)ingle Responsibility Principle (SRP), Open / Closed Principle (OCP), Liskov
* Substitution Principle (LSP), Interface Segregation Principle (ISP),
* Dependency Inversion Principle (DIP)
*
* */
  
  
  
  
  /*
  alt:
  tag1.UserService -> tag1.MySQLDatabase
  (high level)   (low level)
  
  
  neu:
  
  tag1.UserService -> tag1.Database     <- MySQLService
  (high level)   (abstraction)   (low level)
  
   */


  private static final int MINDEST_ALTER = 1;
  private static final int MAXIMAL_GROESSE = 200;


  void validierenGut(String name, int alter, int goeße, int gewicht, boolean vergeben,
                     boolean leben) {
    
    if(name.equals("admin")){
      return;
    }

    //untergrenze für das allgemeine alter meiner spieler ist 0
    if(alter <= MINDEST_ALTER){
      message("alter");
      return;
    }
    
    if(goeße >= MAXIMAL_GROESSE){

      message("groeße deine groesse war" + goeße + " mindestends: " + MAXIMAL_GROESSE);
      return;
    }
    
    if(gewicht <= 0){
      message("gewicht");
      return;
    }
    
    if (vergeben){
      message("vergeben");
      return;
    }
    
    if(!leben){
      message("wenig leben");
      return;
    }
    
    starteSpiel();
    
    
  }

  private void unguterName() {
    System.out.println("ende1");
 //verpacke nachricht
    //bündle alles zummen
    //sende ab
  }

  private void starteSpiel() {
  }

  

  void message(String begruendung){
    System.out.println("schlecht weil: " + begruendung);
  }

















  public static void resize(Shape shape){
    System.out.println(shape.getArea()); //-> 50
  }

  
  
  void spaßhaben(Sex sexobjektA, Sex sexobjektB){
    sexobjektA.sex();
    sexobjektB.sex();
  }

  static void main() {
    
    
    
    
  }









}