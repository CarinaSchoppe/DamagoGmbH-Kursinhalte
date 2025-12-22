package fi15ae.kw51.tag4.aufgaben.observer.infrastruktur;

import fi15ae.kw51.tag4.aufgaben.observer.application.TemperatureObserver;

public class PerformanceManager implements TemperatureObserver {

  @Override
  public void onTemperatureChanged(int newTemperature) {
    if (newTemperature >= 75) {
      System.out.println("[PERFORMANCE] Performance is affected! Framerate reduced to 30 fps");
    }
  }

  @Override
  public void onTemperatureChanged(int oldTemperature, int newTemperature) {

  }
}