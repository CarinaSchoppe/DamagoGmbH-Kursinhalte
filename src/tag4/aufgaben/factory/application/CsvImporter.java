package tag4.aufgaben.factory.application;

import tag4.aufgaben.factory.infrastrucure.CsvParser;

public class CsvImporter extends Importer {
  @Override
  protected Parser createParser() {
    return new CsvParser();
  }
}