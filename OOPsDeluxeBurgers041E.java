public class OOPsDeluxeBurgers041E extends OOPsTypesOfBurgers041D {
  private OOPsItem041C deluxe1;
  private OOPsItem041C deluxe2;

  public OOPsDeluxeBurgers041E(String name, double price) {
    super(name, price);
  }

  // @Override
  public void addToppings(String topping1, String topping2, String topping3, String topping4, String topping5) {
    super.addToppings(topping1, topping2, topping3);
    deluxe1 = new OOPsItem041C(topping4, "topping", 0);
    deluxe2 = new OOPsItem041C(topping5, "topping", 0);
  }

  @Override
  public void printItemizedList() {
    super.printItemizedList();

    if (deluxe1 != null) {
      deluxe1.printItem();
    }
    if (deluxe2 != null) {
      deluxe2.printItem();
    }
  }

  @Override
  public double getExtraPrice(String toppingName) {
    return 0;
  }
}
