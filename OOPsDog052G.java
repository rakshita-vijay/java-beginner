public class OOPsDog052G extends OOPsAbstractClassMammal052E {

  public OOPsDog052G (String type, String size, double weight) {
    super(type, size, weight);
  }

  @Override
  public void move(String speed) {
    if (speed.toLowerCase() == "slow" || speed.toLowerCase() == "slowly") {
      // System.out.println(type.substring(0, 1).toUpperCase() + type.substring(1) + " moves slowly...");
      System.out.println(getExplicitType() + " moves slowly...");
    } else if (speed.toLowerCase() == "fast") {
      // System.out.println(type.substring(0, 1).toUpperCase() + type.substring(1) + " moves fast!");
      System.out.println(getExplicitType() + " moves fast!");
    }
  }

  @Override
  public void makeNoise() {
    if (type.toLowerCase() == "wolf") {
      System.out.println("Howling!");
    } else if (type.toLowerCase() == "dog") {
      System.out.println("Barking!");
    } else {
      System.out.println("Unknown type of dog making noise!");
    }
  }

  @Override
  public void shedHair() {
    System.out.println(getExplicitType() + " sheds all year round");
  }
}
