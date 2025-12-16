package tag1;

public class Mann extends Mensch{
  
  private int bartwachstumsrate;

  public Mann(String name, int alter, int bartwachstumsrate) {
    super(name, alter);
    this.bartwachstumsrate = bartwachstumsrate;
  }

  public int getBartwachstumsrate() {
    return bartwachstumsrate;
  }

  public void setBartwachstumsrate(int bartwachstumsrate) {
    this.bartwachstumsrate = bartwachstumsrate;
  }

  @Override
  public void sex() {
    System.out.println("oooooohhhhhhh");
  }

  
}