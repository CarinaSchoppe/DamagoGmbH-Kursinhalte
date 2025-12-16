package tag1;

public class Eltern {


  private String text_a;

  public Eltern(String text_a) {
    this.text_a = text_a;
  }

  String export(){
    return "{"+text_a+"}";
  }


  public String getText_a() {
    return text_a;
  }
}