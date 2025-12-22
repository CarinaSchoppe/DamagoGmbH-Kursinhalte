package fi15ae.kw51.tag4.aufgaben.observer.infrastruktur;

import fi15ae.kw51.tag4.aufgaben.observer.application.TemperatureObserver;

public class ShutdownSystem implements TemperatureObserver {
  @Override
  public void onTemperatureChanged(int newTemperature) {
    if (newTemperature > 90) {
      System.out.println("[SHUTDOWN] System will be shut down!");
    }
  }

  @Override
  public void onTemperatureChanged(int oldTemperature, int newTemperature) {

  }
}