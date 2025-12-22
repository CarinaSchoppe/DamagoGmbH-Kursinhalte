package fi15ae.kw51.tag1;

public class Square implements Shape{


  private final int side;

  public Square(int side) {
    this.side = side;
  }

  @Override
  public int getArea() {
    return side * side;
  }
}