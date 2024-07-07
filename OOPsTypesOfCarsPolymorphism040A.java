public class OOPsTypesOfCarsPolymorphism040A {
  public static void main(String[] args) {
    OOPsCar040B car = new OOPsCar040B("2022 Blue Ferrari 296 GTS");
    runRace(car);
  }

  public static void runRace(OOPsCar040B car) {
    car.startEngine();
    car.drive();
  }
}
