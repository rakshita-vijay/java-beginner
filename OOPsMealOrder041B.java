// HAVE TO USE COMPOSITION

public class OOPsMealOrder041B {
  private OOPsTypesOfBurgers041D burger;
  private OOPsItem041C drink;
  private OOPsItem041C sideItem;
  // private OOPsDeluxeBurgers041E deluxeBurger = new OOPsDeluxeBurgers041E(this.getBurger().getName(), 8.5);

  public OOPsMealOrder041B() {
    this("regular", "coke", "fries");
  }

  public OOPsMealOrder041B(String burger, String drink, String sideItem) {
    if (burger.equalsIgnoreCase("deluxe")) {
      this.burger = new OOPsDeluxeBurgers041E(burger, 8.5);
    } else {
      this.burger = new OOPsTypesOfBurgers041D(burger, 4);
    }

    this.drink = new OOPsItem041C(drink, "drink", 1);
    this.sideItem = new OOPsItem041C(sideItem, "side", 1.5);
  }

  public OOPsTypesOfBurgers041D getBurger() {
    return burger;
  }

  public OOPsItem041C getDrink() {
    return drink;
  }

  public OOPsItem041C getSideItem() {
    return sideItem;
  }

  // public OOPsDeluxeBurgers041E getDeluxeBurger() {
  //   return deluxeBurger;
  // }

  public double getTotalPrice() {
    if (burger instanceof OOPsDeluxeBurgers041E) {
      return burger.getAdjustedPrice();
    } else {
      return (burger.getAdjustedPrice() + drink.getAdjustedPrice() + sideItem.getAdjustedPrice());
    }
  }

  public void printItemizedList() {
    burger.printItem();

    if (burger instanceof OOPsDeluxeBurgers041E) {
      OOPsItem041C.printItem(drink.getName(), 0);
      OOPsItem041C.printItem(sideItem.getName(), 0);
    } else {
      drink.printItem();
      sideItem.printItem();
    }

    System.out.println("-".repeat(40));
    OOPsItem041C.printItem("TOTAL PRICE", getTotalPrice());
  }
}
