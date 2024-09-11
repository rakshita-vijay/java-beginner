public class OOPsFish052D extends OOPsAbstractClassAnimal052B {

  public OOPsFish052D (String type, String size, double weight) {
    super(type, size, weight);
  }

  @Override
  public void move(String speed) {
    if (speed.toLowerCase() == "slow" || speed.toLowerCase() == "slowly") {
      // System.out.println(type.substring(0, 1).toUpperCase() + type.substring(1) + " swims lazily...");
      System.out.println(getExplicitType() + " swims lazily...");
    } else if (speed.toLowerCase() == "fast") {
      // System.out.println(type.substring(0, 1).toUpperCase() + type.substring(1) + " darts frantically!");
      System.out.println(getExplicitType() + " darts frantically!");
    }
  }

  @Override
  public void makeNoise() {
    if (type.toLowerCase() == "goldfish") {
      System.out.println("Swish!");
    } else if (type.toLowerCase() == "koi") {
      System.out.println("Splish splash!");
    } else {
      System.out.println("Splashes a lot!");
    }
  }
}
