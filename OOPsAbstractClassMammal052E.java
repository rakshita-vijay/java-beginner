abstract class OOPsAbstractClassMammal052E extends OOPsAbstractClassAnimal052B {
  public OOPsAbstractClassMammal052E (String type, String size, double weight) {
    super(type, size, weight);
  }

  @Override
  public void move (String speed) {
    System.out.print(getExplicitType() + " ");
    System.out.println(speed.equals("slow") ? "walks" : "runs");
  }

  public abstract void shedHair();
}
