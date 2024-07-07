public class OOPsElectricCar040D extends OOPsCar040B {
  public double avgKmPerCharge;
  public int batterySize;

  public OOPsElectricCar040D(String description) {
    super(description);
  }

  public OOPsElectricCar040D(String description, double avgKmPerCharge, int batterySize) {
    super(description);

    this.avgKmPerCharge = avgKmPerCharge;
    this.batterySize = batterySize;
  }

  @Override
  public void startEngine() {
    System.out.printf("Switched %d kWh battery on, ready to run. %n", batterySize);
  }

  @Override
  protected void runEngine() {
    System.out.printf("Gas usage under the average (%.2f km/charge). %n", avgKmPerCharge);
  }
}
