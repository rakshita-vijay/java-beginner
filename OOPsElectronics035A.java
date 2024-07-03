public class OOPsElectronics035A {
  public static void main(String[] args) {
    OOPsMonitor035D theMonitor = new OOPsMonitor035D("27-inch beast", "Acer", 27, "2540 x 1440");
    OOPsMotherboard035E theMotherboard = new OOPsMotherboard035E("BJ-200", "Asus", 4, 6, "v2.44");
    OOPsComputerCase035F theComputerCase = new OOPsComputerCase035F("2208", "Dell", "240");
    OOPsPersonalComputer035C thePC = new OOPsPersonalComputer035C("2208", "Dell", theMonitor, theMotherboard, theComputerCase);

    // thePC.getMonitor().drawPixelAt(10, 10, "Red");
    // thePC.getMotherboard().loadProgram("Windows OS");
    // thePC.getComputerCase().pressPowerButton();

    thePC.powerUp();
  }
}
