class OOPsSatellite054I implements OOPsOrbitEarth054C {
  public String getSimpleName() {
    return (getClass().getSimpleName().substring(4, (getClass().getSimpleName().length() - 4)));
  }

  @Override
  public void achieveOrbit() {
    System.out.println("Orbit achieved");
  }

  @Override
  public void takeOff() {
    System.out.println(getSimpleName() + "has taken off");
  }
  @Override
  public void land() {
    System.out.println(getSimpleName() + "has landed");
  }
  @Override
  public void fly() {
    System.out.println(getSimpleName() + "is flying");
  }
}
