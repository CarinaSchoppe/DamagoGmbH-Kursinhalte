package tag4.aufgaben.observer.infrastruktur;

import tag4.aufgaben.observer.application.TemperatureObserver;

public class WarningSystem implements TemperatureObserver {

  private int warningThreshold = 3;


  @Override
  public void onTemperatureChanged(int newTemperature) {
    if (newTemperature >= 80) {
      System.out.println("[WARNING] Temperature is too high!");
      warningThreshold++;
      if (warningThreshold >= 3) {
        System.out.println("[WARNING] System will be shut down!");
        System.exit(0);
      }
    }
  }

  @Override
  public void onTemperatureChanged(int oldTemperature, int newTemperature) {

  }
}