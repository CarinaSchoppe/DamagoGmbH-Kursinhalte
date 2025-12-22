package fi15ae.kw51.tag1;

public class MySQLDatabase implements  Database{


  public void save(String data){
    System.out.println("Saving to SQL: " + data);
  }
}