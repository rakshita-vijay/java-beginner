public class OOPsGasPoweredCar040C extends OOPsCar040B {
  private double avgKmPerLitre;
  private int cylinders;

  public OOPsGasPoweredCar040C(double avgKmPerLitre, int cylinders) {
    this.avgKmPerLitre = avgKmPerLitre;
    this.cylinders = cylinders;
  }

  @Override
  public void printRunTimeType() {
    // System.out.println(car + " is of type " + this.getClass().getSimpleName());
    super.printRunTimeType();
  }
}
