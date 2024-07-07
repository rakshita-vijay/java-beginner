public class OOPsHybridCar040E extends OOPsCar040B {
  public double avgKmPerLitre;
  public int batterySize;
  public int cylinders;

  public OOPsHybridCar040E(String description) {
    super(description);
  }

  public OOPsHybridCar040E(String description, double avgKmPerLitre, int batterySize, int cylinders) {
    super(description);

    this.avgKmPerLitre = avgKmPerLitre;
    this.batterySize = batterySize;
    this.cylinders = cylinders;
  }

  @Override
  public void startEngine() {
    System.out.printf("All %d cylinders are fired up. ", cylinders);
    System.out.printf("Switched %d kWh battery on, ready to run. %n", batterySize);
  }

  @Override
  protected void runEngine() {
    System.out.printf("Gas usage under the average (%.2f km/l). %n", avgKmPerLitre);
  }
}
