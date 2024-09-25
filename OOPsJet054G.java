public class OOPsJet054G implements OOPsFlightEnabled054B, OOPsTrackable054D {
  public String getSimpleName() {
    return (getClass().getSimpleName().substring(4, (getClass().getSimpleName().length() - 4)));
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
