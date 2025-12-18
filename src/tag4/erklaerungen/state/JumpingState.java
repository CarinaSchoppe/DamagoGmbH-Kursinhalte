package tag4.erklaerungen.state;

public class JumpingState implements PlayerState {

  @Override
  public void onMoveRight(Player player) {
    System.out.println("[Jumping] air-control: moving right (optional)");
    player.setState(new RunningState());
  }

  @Override
  public void onStop(Player player) {
    System.out.println("[Jumping] can't fully stop in air (optional)");
  }

  @Override
  public void onJump(Player player) {
    System.out.println("[Jumping] already jumping - no double jump allowed");
  }

  @Override
  public void onLand(Player player) {
    System.out.println("[Jumping] landed");
    player.setState(new IdleState());
  }

  @Override
  public String name() {
    return "JUMPING";
  }
}