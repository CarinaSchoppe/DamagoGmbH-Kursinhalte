package fi15ae.kw51.tag4.erklaerungen.state;

public class RunningState implements PlayerState {

  @Override
  public void onMoveRight(Player player) {
    System.out.println("[Running] keep running");
  }

  @Override
  public void onStop(Player player) {
    System.out.println("[Running] stop running");
    player.setState(new IdleState());
  }

  @Override
  public void onJump(Player player) {
    System.out.println("[Running] jump while running");
    player.setState(new JumpingState());
  }

  @Override
  public void onLand(Player player) {
    System.out.println("[Running] already on ground");
  }

  @Override
  public String name() {
    return "RUNNING";
  }
}