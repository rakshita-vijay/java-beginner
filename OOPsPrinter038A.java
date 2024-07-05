// ENCAPSULATION

public class OOPsPrinter038A {
  public static void main(String[] args) {
    OOPsLaserPrinter038B laserPrinter = new OOPsLaserPrinter038B(50, true);
    System.out.printf("Toner level: %d \nPages printed: %d \nDuplex status: %b \n", laserPrinter.tonerLevel, laserPrinter.getPagesPrinted(), laserPrinter.duplex);

    System.out.println();
    System.out.printf("Current job's pages printed: %d \nPrinter total: %d \n", laserPrinter.printCurrentJobPages(5), laserPrinter.getPagesPrinted());

    System.out.println();

    System.out.printf("Current job's pages printed: %d \nPrinter total: %d \n", laserPrinter.printCurrentJobPages(10), laserPrinter.getPagesPrinted());
  }
}
