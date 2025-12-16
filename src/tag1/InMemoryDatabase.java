package tag1;

public class InMemoryDatabase implements  Database{
  
  @Override
  public void save(String data){
    System.out.println("Saving to Memorybase: " + data);
  }
}