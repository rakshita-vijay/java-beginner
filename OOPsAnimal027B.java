public class OOPsAnimal027B {
  protected String type;   // allows OOPsDog027C to access it
  private String size;
  private double weight;

  public OOPsAnimal027B() {}

  public OOPsAnimal027B(String type, String size, double weight) {
    this.type = type;
    this.size = size;
    this.weight = weight;
  }

  public void move(String speed) {
    System.out.println(type + " moves " + speed.toLowerCase() + ".");
  }

  public void makesNoise() {
    System.out.println(type + " makes some kind of noise.");
  }

  public String toString() {
    return "Animal { Type = " + type + ", Size = " + size + ", Weight = " + weight + " }";
  }
}
