package fi15ae.kw51.tag4.aufgaben.factory.infrastrucure;

import fi15ae.kw51.tag4.aufgaben.factory.application.Parser;
import fi15ae.kw51.tag4.aufgaben.factory.domain.Document;

public class CsvParser implements Parser {

  @Override
  public Document parse(String input) {
    //GANZ VIEL ANALYSE UND TYPISCHES CSV KRAM
    return new Document("CSV", "Parsed CSV: " + input);
  }
}