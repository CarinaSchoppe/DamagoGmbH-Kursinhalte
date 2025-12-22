package fi15ae.kw51.tag4.aufgaben.observer.infrastruktur;

import fi15ae.kw51.tag4.aufgaben.observer.application.TemperatureObserver;

public class FanController implements TemperatureObserver {

  @Override
  public void onTemperatureChanged(int newTemperature) {
    if (newTemperature >= 70) {
      System.out.println("[FAN] Fan speed increased!");
    }
  }

  @Override
  public void onTemperatureChanged(int oldTemperature, int newTemperature) {

  }
}