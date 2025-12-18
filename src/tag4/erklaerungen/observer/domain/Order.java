package tag4.erklaerungen.observer.domain;

import java.util.HashSet;
import java.util.Set;
import tag4.erklaerungen.observer.application.OrderObserver;

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