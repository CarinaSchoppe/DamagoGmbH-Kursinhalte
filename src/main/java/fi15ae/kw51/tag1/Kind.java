package fi15ae.kw51.tag1;

public class Kind extends Eltern{


  private final String text_b;

  public Kind(String text_a, String text_b) {
    super(text_a);
    this.text_b = text_b;
  }

  @Override
  String export() {
    return "{"+getText_a()+"}{"+text_b+"}";
  }
}