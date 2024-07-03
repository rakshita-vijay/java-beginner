public class OOPsMonitor035D extends OOPsProduct035B { // COMPOSITION
  private int size;
  private String resolution;

  public OOPsMonitor035D(String model, String manufacturer) {
    super(model, manufacturer);
  }

  public OOPsMonitor035D(String model, String manufacturer, int size, String resolution) {
    super(model, manufacturer);

    this.size = size;
    this.resolution = resolution;
  }

  public OOPsMonitor035D(String model, String manufacturer, int width, int height, int depth, int size, String resolution) {
    super(model, manufacturer, width, height, depth);

    this.size = size;
    this.resolution = resolution;
  }

  public void drawPixelAt(int x, int y, String color) {
    System.out.printf("Drawing pixel at (%d, %d) in color %s. \n", x, y, color.toLowerCase());
  }
}
