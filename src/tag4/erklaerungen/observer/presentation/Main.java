package tag4.erklaerungen.observer.presentation;

import tag4.erklaerungen.observer.domain.Order;
import tag4.erklaerungen.observer.infrastructure.EmailNotification;
import tag4.erklaerungen.observer.infrastructure.InvoiceService;
import tag4.erklaerungen.observer.infrastructure.ShippingService;

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