package tag3.aufgaben;

public class Logger {


  private static Logger logger;

  public void info(String message){
    System.out.println("[INFO] " + message);
  }


  public void error(String message){
    System.out.println("[ERROR] " + message);
  }

  private Logger() {
  }

  public static Logger getLogger() {
    if (logger == null) {
      logger = new Logger();
    }
    return logger;
  }

  static void main() {
    var logger1 = getLogger();
    logger1.info("Hallo2");
    var logger2 = getLogger();
    logger2.error("Hallo1");

    System.out.println(logger1 == logger2);
  }
}


class UserService{

  Logger logger = Logger.getLogger();

}

class OrderService{
  Logger logger = Logger.getLogger();
}
class Main{

  static void main() {
    var us = new UserService();
    var os = new OrderService();

    us.logger.info("Hallo3");
    os.logger.error(os.getClass().getName()+"Hallo14");
  }
}