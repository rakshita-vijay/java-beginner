public class OOPsTest054K {
  public static void main(String[] args) {
    inFlight(new OOPsJet054G());
  }

  private static void inFlight(OOPsFlightEnabled054B flier) {
    flier.takeOff();
    flier.transition(FlightStages.LAUNCH);
    flier.fly();
    if (flier instanceof OOPsTrackable054D tracked) {
      tracked.track();
    }
    flier.land();
  }
}
