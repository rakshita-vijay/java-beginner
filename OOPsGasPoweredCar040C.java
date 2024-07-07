public class OOPsGasPoweredCar040C extends OOPsCar040B {
  private double avgKmPerLitre;
  private int cylinders;

  public OOPsGasPoweredCar040C(String description) {
    super(description);
  }

  public OOPsGasPoweredCar040C(String description, double avgKmPerLitre, int cylinders) {
    super(description);

    this.avgKmPerLitre = avgKmPerLitre;
    this.cylinders = cylinders;
  }

  @Override
  public void startEngine() {
    System.out.printf("All %d cylinders are fired up, ready to run. %n", cylinders);
  }

  @Override
  protected void runEngine() {
    System.out.printf("Gas usage exceeds the average (%.2f km/l). %n", avgKmPerLitre);
  }
}
