package tag4.aufgaben.factory.infrastrucure;

import tag4.aufgaben.factory.application.Parser;
import tag4.aufgaben.factory.domain.Document;

public class JsonParser implements Parser {

  @Override
  public Document parse(String input) {
    //GANZ VIEL ANALYSE UND TYPISCHES JSON KRAM
    return new Document("JSON", "Parsed JSON: " + input);
  }
}