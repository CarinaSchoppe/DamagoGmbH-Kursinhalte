package tag4.aufgaben.state.domain;

public class PlayerStats {


  private int health; //0..20
  private final int hunger; //0..20 (optional) aber hier umgesetzt
  private int combatTicksLeft; //countdown für Combat-Abklingzeit


  public PlayerStats(int health, int hunger) {
    this.health = clamp(health, 0, 20);
    this.hunger = clamp(hunger, 0, 20);
    this.combatTicksLeft = 0;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int newHealth) {
    this.health = clamp(newHealth, 0, 20);
  }

  public int getHunger() {
    return hunger;
  }

  public int getCombatTicksLeft() {
    return combatTicksLeft;
  }

  public boolean isDead() {
    return health <= 0;
  }

  public void damage(int amount) {
    if (amount <= 0) {
      return;
    }
    health = clamp(health - amount, 0, 20);
  }

  public void heal(int amount) {
    if (amount <= 0) {
      return;
    }
    health = clamp(health + amount, 0, 20);
  }

  public void startCombat(int ticks) {
    this.combatTicksLeft = Math.max(0, ticks);
  }

  public void resetCombat(int ticks) {
    startCombat(ticks);
  }

  public void decrementCombatTick() {
    if (combatTicksLeft > 0) {
      combatTicksLeft--;
    }
  }


  //Ergebnis darf nur innerhalb eines vorgegebenen bereichs liegen
  private int clamp(int v, int min, int max) {
    return Math.max(min, Math.min(max, v));
  }

}