package fi15ae.kw51.tag4.aufgaben.state.domain;

import fi15ae.kw51.tag4.aufgaben.state.application.PlayerState;
import java.util.Objects;
import java.util.function.Consumer;

public class Player {


  private final String name;
  //Logger init. -> damit Domain nicht in infrastruc. importieren muss
  private final Consumer<String> logger;
  private final PlayerStats stats;
  private PlayerState state;

  public Player(String name, PlayerStats stats, PlayerState state, Consumer<String> logger) {
    this.name = Objects.requireNonNull(name);
    this.stats = Objects.requireNonNull(stats);
    this.state = Objects.requireNonNull(state);
    this.logger = (logger != null) ? logger : (message -> {
      System.out.println(message);
    });
  }

  public PlayerStats getStats() {
    return stats;
  }

  public String getName() {
    return name;
  }

  public String getStateName() {
    return state.name();
  }


  public void setState(PlayerState newState) {
    Objects.requireNonNull(newState);
    String old = this.state.name();
    String next = newState.name();
    this.state = newState;
    logger.accept(String.format("Player %s changed state from %s to %s", name, old, next));
  }


  // -- EVENTS als öffentliche API --
  public void move() {
    state.onMove(this);
  }

  public void attack() {
    state.onAttack(this);
  }

  public void placeBlock() {
    state.onPlaceBlock(this);
  }

  public void takeDamage(int amount) {
    state.onTakeDamage(this, amount);
  }

  public void heal(int amount) {
    state.onHeal(this, amount);
  }

  public void tick() {
    state.onTick(this);
  }

  public void die() {
    state.onDie(this);
  }

  public void respawn() {
    state.onRespawn(this);
  }

  public void toggleBuildMode() {
    state.onToggleBuildMode(this);
  }


  //BONUS A
  public void setSpectator(boolean enabled) {
    if (stats.isDead()) {
      logger.accept("Player is dead, can't set spectator mode");
      return;
    }

    //HIER LOGIK FÜR SPECATOR MACHEN!

    logger.accept("Spectator mode set to " + enabled);
  }

}