package fi15ae.kw51.tag4.aufgaben.factory.presentation;

import fi15ae.kw51.tag4.aufgaben.factory.application.DocumentImportService;
import fi15ae.kw51.tag4.aufgaben.factory.domain.Document;

public class Main {

  static void main() {

    String input = "datei.csv";

    DocumentImportService docService = new DocumentImportService();
    Document doc = docService.importFile(input, "hallo");


  }
}