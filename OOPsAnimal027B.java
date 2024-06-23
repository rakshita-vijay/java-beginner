public class OOPsAnimal027B {
  private String type;
  private String size;
  private double weight;

  public OOPsAnimal027B() {}

  public OOPsAnimal027B(String type, String size, double weight) {
    this.type = type;
    this.size = size;
    this.weight = weight;
  }

  public String toString() {
    return "Animal { type = " + type + ", size = " + size + ", weight = " + weight + " }";
  }

  public void move(String speed) {
    System.out.println(type + " moves " + speed);
  }

  public void makesNoise() {
    System.out.println(type + " makes some kind of noise");
  }
}
