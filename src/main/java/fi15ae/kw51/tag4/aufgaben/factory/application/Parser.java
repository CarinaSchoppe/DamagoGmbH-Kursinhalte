package fi15ae.kw51.tag4.aufgaben.factory.application;

import fi15ae.kw51.tag4.aufgaben.factory.domain.Document;

public interface Parser {

  Document parse(String input);

}