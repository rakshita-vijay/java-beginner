public class OOPsLaserPrinter038B {
  protected int tonerLevel;
  protected int pagesPrinted;
  protected boolean duplex;

  public OOPsLaserPrinter038B(int tonerLevel, boolean duplex) {
    this.tonerLevel = tonerLevel;
    this.duplex = duplex;
  }

  public OOPsLaserPrinter038B(int tonerLevel, int pagesPrinted, boolean duplex) {
    this.tonerLevel = tonerLevel;
    this.pagesPrinted = pagesPrinted;
    this.duplex = duplex;
  }

  public int addToner(int tonerAmount) {
    tonerLevel += tonerAmount;
    return ((tonerLevel < 0 || tonerLevel > 100) ? -1 : tonerLevel);
  }

  public int printCurrentJobPages(int pages) {
    System.out.println(duplex ? "It is a duplex printer." : "");

    pagesPrinted += (duplex ? (int)(Math.ceil((double)pages / 2)) : pages);
    return (duplex ? (int)(Math.ceil((double)pages / 2)) : pages);
  }

  public int getPagesPrinted() { return pagesPrinted; }
}
