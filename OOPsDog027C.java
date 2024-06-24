public class OOPsDog027C extends OOPsAnimal027B {
  private String earShape;
  private String tailShape;

  public OOPsDog027C() {
    // super();
    super("Siberian", "Big", 50);
  }

  public OOPsDog027C(String type, double weight) {
    this(type, weight, "Perky", "Curled");
  }

  public OOPsDog027C(String type, double weight, String earShape, String tailShape) {
    super(type, (weight < 15 ? "Small" : ((weight < 35) ? "Medium" : "Large")), weight);
    this.earShape = earShape;
    this.tailShape = tailShape;
  }

  // overriding method 1
  public void makesNoise() {   // if no statements are given inside the method, it makes all dogs silent
    if (type == "Wolf") {
      System.out.print("Owo owoooooo!");
    } else {
      bark();
    }
    System.out.println();
  }

  // overriding method 2
  public void move(String speed) {
    super.move(speed);   // if only this statement is given, it is equivalent to not having an overriding method at all
    // System.out.println("Dogs walk, run, and wag their tails.");
    if (speed == "Slow") {
      walk();
      wagTail();
    } else {
      run();
    }
  }

  private void bark() { System.out.print("Woof! "); }

  private void walk() { System.out.print("Dog is walking. "); }

  private void run() { System.out.print("Dog is running. "); }

  private void wagTail() { System.out.println("Dog's tail is wagging. "); }

  public String toString() {
    return "Dog { Ear Shape = " + earShape + ", Tail Shape = " + tailShape + " } " + super.toString();
  }
}
