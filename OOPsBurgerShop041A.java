public class OOPsBurgerShop041A {
  public static void main(String[] args) {
    // OOPsItem041C coke = new OOPsItem041C("coke", "drink", 1.5);
    // coke.printItem();
    // coke.setSize("large");
    // coke.printItem();

    // OOPsItem041C avocado = new OOPsItem041C("avocado", "topping", 1.5);
    // avocado.printItem();

    // OOPsTypesOfBurgers041D burger1 = new OOPsTypesOfBurgers041D("regular", 4);
    // burger1.addToppings("bacon", "cheese", "mayo");
    // burger1.printItem();

    // OOPsMealOrder041B firstMeal = new OOPsMealOrder041B();
    // // regularMeal.printItemizedList();

    // firstMeal.getBurger().addToppings("bacon", "cheese", "mayo");
    // firstMeal.getDrink().setSize("large");
    // firstMeal.getSideItem().setSize("small");
    // firstMeal.printItemizedList();

    OOPsMealOrder041B secondMeal = new OOPsMealOrder041B("turkey", "pepsi", "fries");
    secondMeal.getBurger().addToppings("lettuce", "CHEESE", "mayo");
    secondMeal.getDrink().setSize("small");
    secondMeal.getSideItem().setSize("large");
    secondMeal.printItemizedList();
  }
}
