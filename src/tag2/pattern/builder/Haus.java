package tag2.pattern.builder;

import java.awt.Color;

public class Haus implements Cloneable {

  private boolean door;
  private int walls;
  private int floorSizeX;
  private int floorSizeY;
  private Color color;


  public boolean isDoor() {
    return door;
  }

  public void setDoor(boolean door) {
    this.door = door;
  }

  public int getWalls() {
    return walls;
  }

  public void setWalls(int walls) {
    this.walls = walls;
  }

  public int getFloorSizeX() {
    return floorSizeX;
  }

  public void setFloorSizeX(int floorSizeX) {
    this.floorSizeX = floorSizeX;
  }

  public int getFloorSizeY() {
    return floorSizeY;
  }

  public void setFloorSizeY(int floorSizeY) {
    this.floorSizeY = floorSizeY;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  @Override
  public Haus clone()  throws  CloneNotSupportedException {
    super.clone();
    var haus = new Haus();
    haus.setDoor(this.door);
    haus.floorSizeX = this.floorSizeX;
    haus.floorSizeY = this.floorSizeY;
    haus.color = this.color;
    return haus;
  }
}