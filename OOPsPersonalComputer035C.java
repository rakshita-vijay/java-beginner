public class OOPsPersonalComputer035C extends OOPsProduct035B { // INHERITANCE
  private OOPsMonitor035D monitor;
  private OOPsMotherboard035E motherboard;
  private OOPsComputerCase035F computerCase;

  public OOPsPersonalComputer035C(String model, String manufacturer) {
    super(model, manufacturer);
  }

  public OOPsPersonalComputer035C(String model, String manufacturer, int width, int height, int depth) {
    super(model, manufacturer, width, height, depth);
  }

  public OOPsPersonalComputer035C(String model, String manufacturer, OOPsMonitor035D monitor, OOPsMotherboard035E motherboard, OOPsComputerCase035F computerCase) {
    super(model, manufacturer);

    this.monitor = monitor;
    this.motherboard = motherboard;
    this.computerCase = computerCase;
  }

  public OOPsPersonalComputer035C(String model, String manufacturer, int width, int height, int depth, OOPsMonitor035D monitor, OOPsMotherboard035E motherboard, OOPsComputerCase035F computerCase) {
    super(model, manufacturer, width, height, depth);

    this.monitor = monitor;
    this.motherboard = motherboard;
    this.computerCase = computerCase;
  }

  private void drawLogo() {
    monitor.drawPixelAt(1200, 50, "Yellow");
  }

  public void powerUp() {
    computerCase.pressPowerButton();
    drawLogo();
  }

  // public OOPsMonitor035D getMonitor() { return monitor; }

  // public OOPsMotherboard035E getMotherboard() { return motherboard; }

  // public OOPsComputerCase035F getComputerCase() { return computerCase; }
}
