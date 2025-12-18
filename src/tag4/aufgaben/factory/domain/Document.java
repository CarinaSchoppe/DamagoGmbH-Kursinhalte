package tag4.aufgaben.factory.domain;

public record Document(String type, String content) {


  @Override
  public String toString() {
    return "Document{" +
        "type='" + type + '\'' +
        ", content='" + content + '\'' +
        '}';
  }
}