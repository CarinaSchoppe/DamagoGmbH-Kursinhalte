package fi15ae.kw51.tag4.aufgaben.factory.application;

import fi15ae.kw51.tag4.aufgaben.factory.infrastrucure.XmlParser;

public class XmlImporter extends Importer {
  @Override
  protected Parser createParser() {
    return new XmlParser();
  }
}