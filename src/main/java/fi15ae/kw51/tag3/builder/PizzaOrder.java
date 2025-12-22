package fi15ae.kw51.tag3.builder;

public class PizzaOrder {

  private final Size size;
  private final boolean cheese;
  private final boolean salami;
  private final boolean mushrooms;
  private PizzaOrder(Builder builder) {
    this.size = builder.size;
    this.cheese = builder.cheese;
    this.salami = builder.salami;
    this.mushrooms = builder.mushrooms;
  }

  public enum Size {
    SMALL, MEDIUM, LARGE
  }

  public static class Builder {

    private final Size size;
    private boolean cheese;
    private boolean salami;
    private boolean mushrooms;

    public Builder(Size size) {
      this.size = size;
    }

    public Builder cheese() {
      this.cheese = true;
      return this;
    }

    public Builder salami() {
      this.salami = true;
      return this;
    }

    public Builder mushrooms() {
      this.mushrooms = true;
      return this;
    }

    public PizzaOrder build() {
      return new PizzaOrder(this);
    }


  }

  class Test {
    static void main() {
      PizzaOrder.Builder order = new PizzaOrder.Builder(Size.SMALL);
      var elem1 = order.cheese().mushrooms().build();
      var elem2 = order.salami().cheese().build();
    }
  }
}