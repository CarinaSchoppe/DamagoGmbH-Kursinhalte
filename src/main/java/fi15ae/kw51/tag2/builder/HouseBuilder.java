package fi15ae.kw51.tag2.builder;

import java.awt.Color;

public class HouseBuilder implements HausBuilder<Haus> {


  private Haus haus;

  public HouseBuilder(int floorSizeX, int floorSizeY) {
    haus = new Haus();
    this.haus.setFloorSizeX(floorSizeX);
    this.haus.setFloorSizeY( floorSizeY);
  }
  
  public HouseBuilder addDoor() {
    this.haus.setDoor(true);
    return this;
  }

  public HouseBuilder addWalls(int walls) {
    return this;
  }

  public HouseBuilder selectColor(Color color) {
    return this;
  }


  @Override
  public boolean reset() {
    haus = new Haus();
    return false;
  }

  @Override
  public Haus build() {
    return haus;
  }


}