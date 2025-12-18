package tag4.aufgaben.observer.domain;

import java.util.ArrayList;
import java.util.List;
import tag4.aufgaben.observer.application.TemperatureObserver;

public class GamingPC {

  private final List<TemperatureObserver> observers = new ArrayList<>();
  private int temperature;
  private final List<Integer> temperatureHistory = new ArrayList<>();

  public void addObserver(TemperatureObserver observer) {
    observers.add(observer);
  }

  public void removeObserver(TemperatureObserver observer) {
    observers.remove(observer);
  }

  public int getTemperature() {
    return temperature;
  }

  public void setTemperature(int newTemp) {
    if (newTemp == this.temperature) {
      return;
    }

    if (newTemp < 0) {
      return;
    }
    if (newTemp < temperature) {
      throw new IllegalArgumentException("Temperature can't be lower than current temperature");
    }
    this.temperature = newTemp;
    System.out.println("Temperature changed to " + temperature);
    notifyObservers(newTemp);
    temperatureHistory.add(newTemp);
  }

  private void notifyObservers(int newTemp) {
    List<TemperatureObserver> observersCopy = new ArrayList<>(observers);
    observersCopy.forEach(observer -> observer.onTemperatureChanged(newTemp));

  }

}