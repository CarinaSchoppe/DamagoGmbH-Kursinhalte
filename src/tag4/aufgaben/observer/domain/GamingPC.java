package tag4.aufgaben.observer.domain;

import java.util.ArrayList;
import java.util.List;
import tag4.aufgaben.observer.application.TemperatureObserver;

public class GamingPC {

  private final List<TemperatureObserver> observers = new ArrayList<>();
  private int temperature;

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
    this.temperature = newTemp;
    System.out.println("Temperature changed to " + temperature);
    notifyObservers(newTemp);
  }

  private void notifyObservers(int newTemp) {
    List<TemperatureObserver> observersCopy = new ArrayList<>(observers);
    observersCopy.forEach(observer -> observer.onTemperatureChanged(newTemp));

  }

}