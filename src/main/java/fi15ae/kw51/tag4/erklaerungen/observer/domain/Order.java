package fi15ae.kw51.tag4.erklaerungen.observer.domain;

import fi15ae.kw51.tag4.erklaerungen.observer.application.OrderObserver;
import java.util.HashSet;
import java.util.Set;

public class Order {

  private final Set<OrderObserver> observers = new HashSet<>();
  private String status;

  public void addObserver(OrderObserver observer) {
    observers.add(observer);
  }

  public void removeObserver(OrderObserver observer) {
    observers.remove(observer);
  }

  public void setStatus(String status) {
    this.status = status;
    notifyObservers();
  }

  private void notifyObservers() {
    for (OrderObserver observer : observers) {
      observer.update(status);
    }
  }

}