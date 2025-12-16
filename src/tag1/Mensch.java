package tag1;

public abstract class Mensch implements Sex{
  
  protected String name;
  protected int alter;

  protected Mensch(String name, int alter) {
    this.name = name;
    this.alter = alter;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAlter() {
    return alter;
  }

  public void setAlter(int alter) {
    this.alter = alter;
  }

 
  @Override
  public abstract void sex();


}