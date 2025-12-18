package tag4.aufgaben.observer.infrastruktur;

import tag4.aufgaben.observer.application.TemperatureObserver;

public class WarningSystem implements TemperatureObserver {

  @Override
  public void onTemperatureChanged(int newTemperature) {
    if (newTemperature >= 80) {
      System.out.println("[WARNING] Temperature is too high!");
    }
  }
}