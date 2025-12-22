package fi15ae.kw51.tag4.aufgaben.observer.presentation;

import fi15ae.kw51.tag4.aufgaben.observer.domain.GamingPC;
import fi15ae.kw51.tag4.aufgaben.observer.infrastruktur.FanController;
import fi15ae.kw51.tag4.aufgaben.observer.infrastruktur.PerformanceManager;
import fi15ae.kw51.tag4.aufgaben.observer.infrastruktur.ShutdownSystem;
import fi15ae.kw51.tag4.aufgaben.observer.infrastruktur.WarningSystem;

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