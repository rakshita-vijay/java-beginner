public class OOPsBird054F extends OOPsAnimal054E implements OOPsFlightEnabled054B, OOPsTrackable054D {
  @Override
  public void move() {
    System.out.println("Flaps Wings");
  }

  @Override
  public void takeOff() {
    System.out.println(getSimpleName() + " is taking off");
  }

  @Override
  public void land() {
    System.out.println(getSimpleName() + " is landing");
  }

  @Override
  public void fly() {
    System.out.println(getSimpleName() + " is flying");
  }

  @Override
  public void track() {
    System.out.println(getSimpleName() + "'s coordinates recorded");
  }
}
