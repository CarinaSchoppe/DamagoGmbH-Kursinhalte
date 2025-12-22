package fi15ae.kw51.tag4.erklaerungen.state;

public class IdleState implements PlayerState {

  @Override
  public void onMoveRight(Player player) {
    System.out.println("[Idle] start moving right");
    player.setState(new RunningState());
  }

  @Override
  public void onStop(Player player) {
    System.out.println("[Idle] already stopped");
  }

  @Override
  public void onJump(Player player) {
    System.out.println("[Idle] jump");
    player.setState(new JumpingState());
  }

  @Override
  public void onLand(Player player) {
    System.out.println("[Idle] already on ground");
  }

  @Override
  public String name() {
    return "IDLE";
  }
}