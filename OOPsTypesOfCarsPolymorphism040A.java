public class OOPsTypesOfCarsPolymorphism040A {
  public static void runRace(OOPsCar040B car) {
    car.printRunTimeType();
    car.startEngine();
    car.drive();
  }

  public static void main(String[] args) {
    OOPsCar040B car = new OOPsCar040B("2022 Blue Ferrari 296 GTS");
    runRace(car);

    System.out.println();

    OOPsGasPoweredCar040C gasPoweredCar = new OOPsGasPoweredCar040C("2022 Blue Ferrari 296 GTS", 15.4, 6);
    runRace(gasPoweredCar);

    System.out.println();

    OOPsElectricCar040D electricCar = new OOPsElectricCar040D("2022 Red Tesla Model 3", 568, 75);
    runRace(electricCar);

    System.out.println();

    OOPsHybridCar040E hybridCar = new OOPsHybridCar040E("2022 Black Ferrari SF90 Stradale", 16, 8, 8);
    runRace(hybridCar);
  }
}
