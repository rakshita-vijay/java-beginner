import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class OOPsInterfaces054A {
  public static void main(String[] args) {
    OOPsBird054F bird = new OOPsBird054F();
    OOPsAnimal054E animal = bird;
    OOPsFlightEnabled054B flier = bird;
    OOPsTrackable054D tracked = bird;

    animal.move();
    // flier.move();
    // tracked.move();

    // flier.takeOff();
    // flier.fly();
    // tracked.track();
    // flier.land();

    inFlight(flier);
    System.out.println();
    inFlight(new OOPsJet054G());

    System.out.println();

    OOPsTrackable054D truck = new OOPsTruck054H();
    truck.track();

    System.out.println();

    double kmsTraveled = 100;
    double milesTraveled = kmsTraveled * OOPsFlightEnabled054B.KM_TO_MILES;
    System.out.printf("The truck travels %.3f km or %.3f miles %n", kmsTraveled, milesTraveled);

    System.out.println();

    ArrayList<OOPsFlightEnabled054B> fliers = new ArrayList<>();
    fliers.add(bird);

    List<OOPsFlightEnabled054B> betterFliers = new ArrayList<>(); // List cannot be passed to a method that takes ArrayList as it's parameter (cannot broaden scope)
    betterFliers.add(bird);

    LinkedList<OOPsFlightEnabled054B> linkedFliers = new LinkedList<>(); // LinkedList cannot be passed to a method that takes ArrayList as it's parameter (cannot jump scope)
    linkedFliers.add(bird);

    List<OOPsFlightEnabled054B> subLinkedfliers = new LinkedList<>();
    subLinkedfliers.add(bird);

    triggerFliers(fliers);
    flyFliers(fliers);
    landFliers(fliers);

    triggerFliers(betterFliers);
    flyFliers(betterFliers);
    landFliers(betterFliers);

    triggerFliers(linkedFliers);
    flyFliers(linkedFliers);
    landFliers(linkedFliers);
  }

  private static void inFlight(OOPsFlightEnabled054B flier) {
    flier.takeOff();
    flier.fly();
    if(flier instanceof OOPsTrackable054D tracked) {
      tracked.track();
    }
    flier.land();
  }

  private static void triggerFliers(List<OOPsFlightEnabled054B> fliers) {
    for(var flier : fliers) {
      flier.takeOff();
    }
  }

  private static void flyFliers(List<OOPsFlightEnabled054B> fliers) {
    for (var flier : fliers) {
      flier.fly();
    }
  }

  private static void landFliers(List<OOPsFlightEnabled054B> fliers) {
    for (var flier : fliers) {
      flier.land();
    }
  }
}
