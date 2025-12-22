package fi15ae.kw51.tag3.singleton;

import fi15ae.kw51.tag2.factory.Auto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppSettings {


  //möglichkeit A:
  private final Map<String, String> map;

  public void setValue(String key, String value) {
    map.put(key, value);
  }

  public String getValue(String key) {
    return map.get(key);
  }

  //------------------------------------------------
  //Möglichkeit B:
  record AufgabenspezifischeElemente(String key, String value) {
  }

  private final List<AufgabenspezifischeElemente> settings = new ArrayList<>();

  public String getValue1(String key) {
    var result =
        settings.stream().filter(s -> s.key().equals(key)).findFirst().orElseGet(() -> null);
    if (result != null) {
      return result.value();
    } else {
      return null;
    }
  }

  public void setValue1(String key, String value) {
    settings.add(new AufgabenspezifischeElemente(key, value));
  }


  //--------------------------------------------------------
  private static AppSettings instance;

  public static AppSettings getInstance() {
    if (instance == null) {
      instance = new AppSettings();
    }
    return instance;
  }

  private AppSettings() {
    this.map = new HashMap<>();
  }


  static void main() {
    foo();
  }


  static Auto test;

  static void foo() {
    test.einschalten();
  }


}