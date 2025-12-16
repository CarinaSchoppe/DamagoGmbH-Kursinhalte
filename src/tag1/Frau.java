package tag1;

public class Frau extends Mensch{
  
  private int haarlänge;

  public Frau(String name, int alter, int haarlänge) {
    super(name, alter);
    this.haarlänge = haarlänge;
  }

  public int getHaarlänge() {
    return haarlänge;
  }

  public void setHaarlänge(int haarlänge) {
    this.haarlänge = haarlänge;
  }


  
  @Override
  public void sex() {
    System.out.println("aaaaaaaaaaahhh");
  }


  
}