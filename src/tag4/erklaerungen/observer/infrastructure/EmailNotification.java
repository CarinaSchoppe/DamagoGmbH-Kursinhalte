package tag4.erklaerungen.observer.infrastructure;

import tag4.erklaerungen.observer.application.OrderObserver;

public class EmailNotification implements OrderObserver {

  @Override
  public void update(String newStatus) {
    System.out.println("[EMAIL] Der Orderstatus ist nun: " + newStatus);
  }
}