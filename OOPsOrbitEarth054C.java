interface OOPsOrbitEarth054C extends OOPsFlightEnabled054B {
  void achieveOrbit();
}

enum OOPsFlightStages054Ci implements OOPsTrackable054D {GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

  public String getSimpleName() {
    return getClass().getSimpleName().substring(4, (getClass().getSimpleName().length() - 4));
  }

  @Override
  public void track() {
    if (this != GROUNDED) {
      System.out.println("Monitoring " + getSimpleName());
    }
  }
}
