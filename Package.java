public class Package {
  private String type;
  private String name;
  private double price;

  public Package (String type, String name, double price) {
    this.type = type;
    this.name = name;
    this.price = price;
  }

  public String getType() { return type; }
  public String getName() { return name; }
  public double getPrice() { return price; }

  public float returnCostToPay() {
    return (float) (this.price + ((5 * this.price) / 100));
  }

  public float returnCostToPay(float taxPercentage) {
    return (float) (this.price + ((taxPercentage * this.price) / 100));
  }
}
