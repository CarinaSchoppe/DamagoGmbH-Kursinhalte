package tag4.erklaerungen.observer.javaeigen;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Player {


  private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
  private int health;

  static void main() {
    var player = new Player();

    player.addListener(
        (event) -> System.out.println(event.getNewValue() + " " + event.getOldValue()));
    player.takeDamage(10);
  }

  public void addListener(PropertyChangeListener listener) {
    propertyChangeSupport.addPropertyChangeListener(listener);
  }

  public void takeDamage(int damage) {
    int old = health;
    health -= damage;

    propertyChangeSupport.firePropertyChange("health", old, health);
  }

}