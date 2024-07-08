// HAVE TO USE COMPOSITION

public class OOPsMealOrder041B {
  private OOPsTypesOfBurgers041C burger;
  private OOPsTypesOfDrinks041D drink;
  private OOPsSideItem041E sideItem;

  public OOPsMealOrder041B() {
    this.burger = new OOPsTypesOfBurgers041C();
    this.drink = new OOPsTypesOfDrinks041D();
    this.sideItem = new OOPsSideItem041E();
  }

  public OOPsMealOrder041B(OOPsTypesOfBurgers041C burger, OOPsTypesOfDrinks041D drink, OOPsSideItem041E sideItem) {
    this.burger = new OOPsTypesOfBurgers041C();
    this.drink = drink;
    this.sideItem = sideItem;
  }
}
