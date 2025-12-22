package fi15ae.kw51.tag4.aufgaben.factory.application;

import fi15ae.kw51.tag4.aufgaben.factory.infrastrucure.CsvParser;

public class CsvImporter extends Importer {
  @Override
  protected Parser createParser() {
    return new CsvParser();
  }
}