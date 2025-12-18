package tag4.aufgaben.factory.application;


import tag4.aufgaben.factory.domain.Document;

public abstract class Importer {


  protected abstract Parser createParser();


  public Document importDocument(String input) {
    Parser parser = createParser();
    return parser.parse(input);
  }
}