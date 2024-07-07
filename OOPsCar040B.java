public class OOPsCar040B {
  private String description;

  public OOPsCar040B(String description) {
    this.description = description;
  }

  public void printRunTimeType() {
    System.out.println("Type: " + this.getClass().getSimpleName());
  }

  public void startEngine() {
    System.out.println("Engine has started.");
  }

  public void drive() {
    System.out.println("Car is being driven.");
    runEngine();
  }

  protected void runEngine() {
    System.out.println("Engine is running.");
  }
}
