public class OOPsFish027D extends OOPsAnimal027B {
  private int gills;
  private int fins;

  public OOPsFish027D(String type, double weight, int gills, int fins) {
    super(type, "Small", weight);

    this.gills = gills;
    this.fins = fins;
  }

  public void moveMuscles() {
    System.out.println("Fish's muscles are moving. ");
  }

  public void moveBackFins() {
    System.out.println("Fish's back fins are moving. ");
  }

  @Override
  public void move(String speed) {
    super.move(speed);   // assigns the value in speed to the variable in the animal class
    moveMuscles();
    if (speed == "Fast") {
      moveBackFins();
    }
  }

  @Override
  public void makesNoise() {}

  public String toString() {
    return "Fish { Gills = " + gills + ", Fins = " + fins + " } " + super.toString();
  }
}
