package tag4.aufgaben.factory.application;

import tag4.aufgaben.factory.infrastrucure.JsonParser;

public class JsonImporter extends Importer {
  @Override
  protected Parser createParser() {
    return new JsonParser();
  }
}