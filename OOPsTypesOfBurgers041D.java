public class OOPsTypesOfBurgers041D extends OOPsItem041C {
  private OOPsItem041C topping1;
  private OOPsItem041C topping2;
  private OOPsItem041C topping3;

  public OOPsTypesOfBurgers041D(String name, double price) {
    super(name, "Burger", price);
  }

  @Override
  public String getName() {
    return super.getName() + "burger";
  }

  @Override
  public double getAdjustedPrice() {
    return super.getBasePrice() + ((topping1 == null) ? 0 : topping1.getAdjustedPrice()) + ((topping2 == null) ? 0 : topping2.getAdjustedPrice()) + ((topping3 == null) ? 0 : topping3.getAdjustedPrice());
  }

  public double getExtraPrice(String toppingName) {
    return switch (toppingName.toUpperCase()) {
      case "AVOCADO", "CHEESE" -> 1.0;
      case "BACON", "HAM", "SALAMI" -> 1.5;
      default -> 0;
    };
  }

  public void addToppings(String topping1, String topping2, String topping3) {
    this.topping1 = new OOPsItem041C(topping1, "topping", getExtraPrice(topping1));
    this.topping2 = new OOPsItem041C(topping2, "topping", getExtraPrice(topping2));
    this.topping3 = new OOPsItem041C(topping3, "topping", getExtraPrice(topping3));
  }

  // public void addToppings(String topping1, String topping2, String topping3, String topping4, String topping5) {
  //   addToppings(topping1, topping2, topping3);
  //   OOPsDeluxeBurgers041E.addToppings(topping1, topping2, topping3, topping4, topping5);
  // }

  @Override
  public void printItem() {
    printItemizedList();
    System.out.println("-".repeat(40));
    super.printItem();
  }

  public void printItemizedList() {
    printItem("base burger", getBasePrice());
    if (topping1 != null) {
      topping1.printItem();
    }
    if (topping2 != null) {
      topping2.printItem();
    }
    if (topping3 != null) {
      topping3.printItem();
    }
  }
}
