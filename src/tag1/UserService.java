package tag1;

public class UserService {


  private final Database database;

  public UserService(Database database) {
    this.database = database;
  }

  public void saveUser(String data){
    database.save(data);
  }


  static void main() {
    new UserService(new MySQLDatabase()).saveUser("test");
    new UserService(new InMemoryDatabase()).saveUser("test");
  }
  
}