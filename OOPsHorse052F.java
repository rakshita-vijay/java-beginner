public class OOPsHorse052F extends OOPsAbstractClassMammal052E {
  public OOPsHorse052F (String type, String size, double weight) {
    super(type, size, weight);
  }

  @Override
  public void shedHair () {
    System.out.println(getExplicitType() + " sheds in the spring");
  }

  @Override
  public void makeNoise() {
    System.out.println("Neighs!");
  }
}
