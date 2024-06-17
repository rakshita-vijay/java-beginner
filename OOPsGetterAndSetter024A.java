public class OOPsGetterAndSetter024A {
  public static void main(String[] args) {
    OOPsCar024B car = new OOPsCar024B();
    car.setMake("Porsche");
    // car.model = "Carrera";
    // car.color = "Red";

    System.out.println("Make: " + car.getMake());
    System.out.println("Model: " + car.getModel());
    System.out.println("Color: " + car.getColor());
    System.out.println("Doors: " + car.getDoors());
    System.out.println("Convertible: " + (car.isConvertible() ? "Yes" : "No"));
    System.out.println();
    car.describeCar();
  }
}
