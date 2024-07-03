public class OOPsComputerCase035F extends OOPsProduct035B { // COMPOSITION
  private String powerSupply;

  public OOPsComputerCase035F(String model, String manufacturer) {
    super(model, manufacturer);
  }

  public OOPsComputerCase035F(String model, String manufacturer, String powerSupply) {
    super(model, manufacturer);

    this.powerSupply = powerSupply;
  }

  public OOPsComputerCase035F(String model, String manufacturer, int width, int height, int depth, String powerSupply) {
    super(model, manufacturer, width, height, depth);

    this.powerSupply = powerSupply;
  }

  public void pressPowerButton() {
    System.out.println("Power button pressed. ");
  }
}
