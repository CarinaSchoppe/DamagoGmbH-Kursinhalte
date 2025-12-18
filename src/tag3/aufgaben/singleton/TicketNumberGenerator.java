package tag3.aufgaben.singleton;


class SupportService {

}

class OderService {

}


public class TicketNumberGenerator {


  private static TicketNumberGenerator instance;
  private int ticketNumber;
  private boolean initialized = false;

  private TicketNumberGenerator() {
  }

  public static synchronized TicketNumberGenerator getInstance() {
    if (instance == null) {
      instance = new TicketNumberGenerator();
    }
    return instance;
  }

  public synchronized void setStart(int start) {
    if (!initialized) {
      ticketNumber = start;
      initialized = true;
    } else {
      throw new IllegalStateException("TicketNumberGenerator wurde bereits initialisiert");
    }
  }

  public synchronized int nextTicketNumber() {
    return ticketNumber++;
  }
}