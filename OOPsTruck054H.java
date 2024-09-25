public class OOPsTruck054H implements OOPsTrackable054D {
  public String getSimpleName() {
    return (getClass().getSimpleName().substring(4, (getClass().getSimpleName().length() - 4)));
  }

  @Override
  public void track() {
    System.out.println(getSimpleName() + "'s coordinates recorded");
  }
}
