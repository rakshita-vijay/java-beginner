public class OOPsTypesOfBurgers041C {
  private String burgerType;
  private double basePrice;

  private boolean topping1;
  private double topping1Price = 1.25;

  private boolean topping2;
  private double topping2Price = 1.50;

  private boolean topping3;
  private double topping3Price = 1.75;

  public OOPsTypesOfBurgers041C() {
    this.burgerType = "Regular burger";
    this.basePrice = 3;
  }

  public OOPsTypesOfBurgers041C(String burgerType, double basePrice) {
    this.burgerType = burgerType;
    this.basePrice = basePrice;
  }

  public double getPrice(String burgerType, boolean topping1, boolean topping2, boolean topping3) {
    double totalPrice = 0;

    if (burgerType.toLowerCase().contains("small")) {
      totalPrice += basePrice;
    } else if (burgerType.toLowerCase().contains("medium")) {
      totalPrice += (basePrice + 1.5);
    } else if (burgerType.toLowerCase().contains("large")) {
      totalPrice += (basePrice + 3.0);
    } else if (burgerType.toLowerCase().contains("deluxe")) {
      return (basePrice * 2);
    }

    if (topping1) {
      totalPrice += topping1Price;
    }
    if (topping2) {
      totalPrice += topping2Price;
    }
    if (topping3) {
      totalPrice += topping3Price;
    }

    return totalPrice;
  }
}
