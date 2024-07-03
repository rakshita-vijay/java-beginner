public class OOPsMotherboard035E extends OOPsProduct035B { // COMPOSITION
  private int ramSlots;
  private int cardSlots;
  private String bios;

  public OOPsMotherboard035E(String model, String manufacturer) {
    super(model, manufacturer);
  }

  public OOPsMotherboard035E(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
    super(model, manufacturer);

    this.ramSlots = ramSlots;
    this.cardSlots = cardSlots;
    this.bios = bios;
  }

  public OOPsMotherboard035E(String model, String manufacturer, int width, int height, int depth, int ramSlots, int cardSlots, String bios) {
    super(model, manufacturer, width, height, depth);

    this.ramSlots = ramSlots;
    this.cardSlots = cardSlots;
    this.bios = bios;
  }

  public void loadProgram(String programName) {
    System.out.println("Program " + programName + " is now loading...");
  }
}
