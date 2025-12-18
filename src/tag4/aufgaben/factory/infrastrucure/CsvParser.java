package tag4.aufgaben.factory.infrastrucure;

import tag4.aufgaben.factory.application.Parser;
import tag4.aufgaben.factory.domain.Document;

public class CsvParser implements Parser {

  @Override
  public Document parse(String input) {
    //GANZ VIEL ANALYSE UND TYPISCHES CSV KRAM
    return new Document("CSV", "Parsed CSV: " + input);
  }
}