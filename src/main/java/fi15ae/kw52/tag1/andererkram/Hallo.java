package fi15ae.kw52.tag1.andererkram;

import fi15ae.kw51.tag3.builder.User;

public class Hallo {

  static void main() {
    var user = new User.Builder("test").city(null).age(25).build();
    System.out.println(user);
  }

  public int addiere(int a, int b) {
    return a + b;
  }


}
