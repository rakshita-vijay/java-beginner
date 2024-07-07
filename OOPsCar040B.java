public class OOPsCar040B {
  private String description;

  public OOPsCar040B(String description) {
    this.description = description;
  }

  public void startEngine() {
    System.out.println("Engine started.");
  }
  public void drive() {
    System.out.println("Car (of type " + this.getClass().getSimpleName() +") is being driven.");
    runEngine();
  }

  protected void runEngine() {
    System.out.println("Engine is running.");
  }

  public void printRunTimeType() {
    System.out.println(this + " is of type " + this.getClass().getSimpleName());
  }
}
