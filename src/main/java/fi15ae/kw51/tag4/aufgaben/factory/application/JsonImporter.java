package fi15ae.kw51.tag4.aufgaben.factory.application;

import fi15ae.kw51.tag4.aufgaben.factory.infrastrucure.JsonParser;

public class JsonImporter extends Importer {
  @Override
  protected Parser createParser() {
    return new JsonParser();
  }
}