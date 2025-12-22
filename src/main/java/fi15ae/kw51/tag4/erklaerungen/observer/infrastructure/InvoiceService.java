package fi15ae.kw51.tag4.erklaerungen.observer.infrastructure;

import fi15ae.kw51.tag4.erklaerungen.observer.application.OrderObserver;

public class InvoiceService implements OrderObserver {

  @Override
  public void update(String newStatus) {
    if ("BEZAHLT".equals(newStatus)) {
      System.out.println("[INVOICE] Invoice created for order");
    }
  }
}