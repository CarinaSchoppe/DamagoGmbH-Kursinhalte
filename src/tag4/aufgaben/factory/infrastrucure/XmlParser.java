package tag4.aufgaben.factory.infrastrucure;

import tag4.aufgaben.factory.application.Parser;
import tag4.aufgaben.factory.domain.Document;

public class XmlParser implements Parser {

  @Override
  public Document parse(String input) {
    //GANZ VIEL ANALYSE UND TYPISCHES XML KRAM
    return new Document("XML", "Parsed XML: " + input);
  }
}