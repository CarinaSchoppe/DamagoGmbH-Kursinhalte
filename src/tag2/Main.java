package tag2;

import java.awt.Color;
import java.util.ArrayList;
import tag2.singleton.Spieleserver;
import tag2.builder.Haus;
import tag2.builder.HouseBuilder;
import tag2.factory.AutoHaus;
import tag2.factory.Fahrzeug;
import tag2.factory.Hangar;
import tag2.factory.Showroom;
import tag2.factory.Werft;

public class Main  extends Object{


  /*
   *
   * KISS -> Keep It (Short / Stupid) "and" Simple
   *
   * DRY -> Dont Repeat Yourself
   *
   * */


  static void main1() {
    var list = new ArrayList<String>();


    var vorhandeneTests = list.stream().filter(element -> element.equals("Test")).count();


  }

  int gut(int x, int y) {
    return x > 30 ? y + 3 :
        x < 40 / y ? -x + 3 : y == x + 3 ? y - 2 : x - y + x * 5 <= y * 4 + x ? 7 : -1;
  }


  void foo() {
    System.out.println("biba");
    garbage();
    System.out.println("bbubu");
  }


  void bar() {
    System.out.println("tititi");
    garbage();
    System.out.println("telelelele");
  }

  void gan() {
    System.out.println("meinssss-");
    garbage();
    System.out.println("spzielll");
  }


  void poo() {
    System.out.println("extraaaadsada");
    garbage();
    System.out.println("eextra");


  }

  private static void garbage() {
    System.out.println("aaa");
    var x = 3;
    var b = 6;
    var a = b * x;
    var z = a + b + x;

    System.out.println(a + z);
    System.out.println("vvbvv");
  }

  static void main() throws CloneNotSupportedException {
    //new Singleton();
    Spieleserver.erstelleInstance();

    HouseBuilder bulder = new HouseBuilder(4,5);

    Haus haus = bulder.addDoor().addWalls(2).selectColor(Color.BLUE).build();
    Haus haus2 =
        bulder.addDoor().addWalls(2).addDoor().addDoor().addDoor().addWalls(5).selectColor(Color.RED).build();

      var haus3 = haus.clone();
      haus3.setColor(Color.RED);



  }







  void extra(){

    var kundenEingabe = "Auto";

    Showroom haendler = switch (kundenEingabe) {
      case "Auto" -> new AutoHaus();
      case "Flugzeug" -> new Hangar();
      case "Schiff" -> new Werft();
      default -> null;
    };

    Fahrzeug fahren = haendler.fahrzeugEinkaufen();

    fahren.einschalten();
    fahren.einsteigen();
    fahren.transportieren();


  }











}