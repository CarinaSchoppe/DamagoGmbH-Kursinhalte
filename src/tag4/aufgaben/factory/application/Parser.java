package tag4.aufgaben.factory.application;

import tag4.aufgaben.factory.domain.Document;

public interface Parser {

  Document parse(String input);

}