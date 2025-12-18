package tag4.aufgaben.observer.presentation;

import tag4.aufgaben.observer.domain.GamingPC;
import tag4.aufgaben.observer.infrastruktur.FanController;
import tag4.aufgaben.observer.infrastruktur.PerformanceManager;
import tag4.aufgaben.observer.infrastruktur.ShutdownSystem;
import tag4.aufgaben.observer.infrastruktur.WarningSystem;

public class Main {

  static void main() {
    var gamingPC = new GamingPC();

    var fan = new FanController();
    var warning = new WarningSystem();
    var perf = new PerformanceManager();
    var shutdown = new ShutdownSystem();

    gamingPC.addObserver(fan);
    gamingPC.addObserver(warning);
    gamingPC.addObserver(perf);
    gamingPC.addObserver(shutdown);

    gamingPC.setTemperature(60);
    gamingPC.setTemperature(72);
    gamingPC.setTemperature(78);
    gamingPC.setTemperature(85);
    gamingPC.setTemperature(92);

    System.out.println("---------- Removing Warning Observer ----------");
    gamingPC.removeObserver(warning);

    gamingPC.setTemperature(95);

    System.exit(1);
  }
}