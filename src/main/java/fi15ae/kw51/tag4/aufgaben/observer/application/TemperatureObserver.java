package fi15ae.kw51.tag4.aufgaben.observer.application;

public interface TemperatureObserver {


  void onTemperatureChanged(int newTemperature);

  void onTemperatureChanged(int oldTemperature, int newTemperature);

}