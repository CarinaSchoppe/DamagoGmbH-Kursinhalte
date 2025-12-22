package fi15ae.kw52.tag1.lombok;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public final class User {

  private final boolean active;

  @EqualsAndHashCode.Include
  private long id;

  @ToString.Exclude
  private String email;
  private final String displayName;


  public User(long id, String email, String displayName, boolean active) {
    if (email == null || email.trim().isEmpty()) {
      throw new IllegalArgumentException("email darf nicht leer sein");
    }
    if (id < 0) {
      throw new IllegalArgumentException("id darf nicht negativ sein");
    }
    this.id = id;
    this.email = email;
    this.displayName = displayName;
    this.active = active;
  }

  static void main() {

    System.out.println(new User(1, "test", "test", true));

  }

  public void setEmail(String email) {
    if (email == null || email.trim().isEmpty()) {
      throw new IllegalArgumentException("email darf nicht leer sein");
    }
    this.email = email;
  }

  public void setId(long id) {
    if (id < 0) {
      throw new IllegalArgumentException("id darf nicht negativ sein");
    }
    this.id = id;
  }


}
