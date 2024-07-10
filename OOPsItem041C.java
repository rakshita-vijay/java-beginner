public class OOPsItem041C {
  private String name;
  private String type;
  private String size = "medium";
  private double price;

  public OOPsItem041C(String name, String type, double price) {
    this.name = name.toLowerCase();
    this.type = type.toLowerCase();
    this.price = price;
  }

  public void setSize(String size) {
    this.size = size.toLowerCase();
  }

  public String getName() {
    if (type.equals("side") || type.equals("drink")) {
      return size + " " + name;
    }
    return name;
  }

  public double getBasePrice() {
    return price;
  }

  public double getAdjustedPrice() {
    return switch (size) {
      case "small" -> (getBasePrice() - 0.5);
      case "large" -> (getBasePrice() + 1);
      default -> getBasePrice();
    };
  }
  public static void printItem(String itemName, double itemPrice) {
    System.out.printf("%20s: $%6.2f%n", itemName, itemPrice);
  }

  public void printItem() {
    printItem(getName(), getAdjustedPrice());
  }
}
