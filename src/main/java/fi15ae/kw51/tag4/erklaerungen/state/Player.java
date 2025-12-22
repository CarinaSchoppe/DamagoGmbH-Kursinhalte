package fi15ae.kw51.tag4.erklaerungen.state;

public class Player {


  private PlayerState state = new IdleState();

  public void moveRight() {
    state.onMoveRight(this);
  }

  public void stop() {
    state.onStop(this);
  }

  public void jump() {
    state.onJump(this);
  }

  public void land() {
    state.onLand(this);
  }

  public PlayerState getState() {
    return state;
  }

  public void setState(PlayerState newState) {
    System.out.println("STATE: " + state.name() + " -> " + newState.name());
    this.state = newState;
  }
}