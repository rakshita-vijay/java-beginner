public abstract class OOPsAbstractClassAnimal052B {
  protected String type;
  protected String size;
  protected double weight;

  public OOPsAbstractClassAnimal052B (String type, String size, double weight) {
    this.type = type;
    this.size = size;
    this.weight = weight;
  }

  public abstract void move(String speed);

  public abstract void makeNoise();

  public String getExplicitType () {
    return getClass().getSimpleName() + " (" + type.substring(0, 1).toUpperCase() + type.substring(1) + ")";
  }
}
