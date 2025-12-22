package fi15ae.kw51.tag3.builder;

public class User {


  //felder
  private final String username;
  private final String email;
  private final int age;
  private final String city;


  private User(Builder builder) {
    this.username = builder.username;
    this.email = builder.email;
    this.age = builder.age;
    this.city = builder.city;
  }

  static void main() {
    var user = new User.Builder("Hallo").email("test@email.com").city("testtst").age(18).build();
  }

  public static class Builder {

    private final String username;
    private String email;
    private int age;
    private String city;

    public Builder(String username) {
      if (username == null || username.trim().isEmpty()) {
        new IllegalArgumentException("username darf nicht leer sein");
      }
      this.username = username; /// -> "xxxxxxxxxxxxxxxHalloxxxxxxxxxxxxxxxxx" -> x "Hallo"
    }

    //optionalen Felder

    public Builder email(String email) {
      if (email != null && email.contains("@")) {
        this.email = email;
        return this;
      }
      throw new IllegalArgumentException("email muss ein gültiges email sein");

    }

    public Builder age(int age) {
      if (age < 0) {
        throw new IllegalArgumentException("age darf nicht negativ sein");
      }
      this.age = age;
      return this;
    }

    public Builder city(String city) {
      this.city = city;
      return this;
    }

    public User build() {
      return new User(this);
    }
  }


}