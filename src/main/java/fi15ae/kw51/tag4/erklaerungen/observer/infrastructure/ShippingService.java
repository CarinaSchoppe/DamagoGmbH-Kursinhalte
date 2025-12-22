package fi15ae.kw51.tag4.erklaerungen.observer.infrastructure;

import fi15ae.kw51.tag4.erklaerungen.observer.application.OrderObserver;

public class ShippingService implements OrderObserver {

  @Override
  public void update(String newStatus) {
    if ("VERSENDET".equals(newStatus)) {
      System.out.println("[SHIPPING] Order shipped!");
    }
  }
}