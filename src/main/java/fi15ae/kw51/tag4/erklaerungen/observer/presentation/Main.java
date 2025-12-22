package fi15ae.kw51.tag4.erklaerungen.observer.presentation;

import fi15ae.kw51.tag4.erklaerungen.observer.domain.Order;
import fi15ae.kw51.tag4.erklaerungen.observer.infrastructure.EmailNotification;
import fi15ae.kw51.tag4.erklaerungen.observer.infrastructure.InvoiceService;
import fi15ae.kw51.tag4.erklaerungen.observer.infrastructure.ShippingService;

public class Main {

  static void main() {


    var order = new Order();


    order.addObserver(new EmailNotification());
    order.addObserver(new InvoiceService());
    order.addObserver(new ShippingService());

    order.setStatus("BESTELLT");
    order.setStatus("BEZAHLT");
    order.setStatus("VERSENDET");


  }
}