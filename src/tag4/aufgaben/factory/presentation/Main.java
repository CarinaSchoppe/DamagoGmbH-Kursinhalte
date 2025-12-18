package tag4.aufgaben.factory.presentation;

import tag4.aufgaben.factory.application.DocumentImportService;
import tag4.aufgaben.factory.domain.Document;

public class Main {

  static void main() {

    String input = "datei.csv";

    DocumentImportService docService = new DocumentImportService();
    Document doc = docService.importFile(input, "hallo");


  }
}