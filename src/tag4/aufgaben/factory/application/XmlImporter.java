package tag4.aufgaben.factory.application;

import tag4.aufgaben.factory.infrastrucure.XmlParser;

public class XmlImporter extends Importer {
  @Override
  protected Parser createParser() {
    return new XmlParser();
  }
}