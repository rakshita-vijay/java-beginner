public class OOPsSmartKitchen036B {
  private OOPsRefrigerator036C iceBox;
  private OOPsDishWasher036D dishWasher;
  private OOPsCoffeeMaker036E brewMaster;

  public OOPsSmartKitchen036B() {
    iceBox = new OOPsRefrigerator036C();
    dishWasher = new OOPsDishWasher036D();
    brewMaster = new OOPsCoffeeMaker036E();
  }

  public OOPsRefrigerator036C getIceBox() { return iceBox; }
  public OOPsDishWasher036D getDishWasher() { return dishWasher; }
  public OOPsCoffeeMaker036E getBrewMaster() { return brewMaster; }

  public void addWater() { brewMaster.setHasWorkToDo(true); }

  public void pourMilk() { iceBox.setHasWorkToDo(true); }

  public void loadDishWasher() { dishWasher.setHasWorkToDo(true); }

  public void setKitchenState(boolean coffeeFlag, boolean refrigeratorFlag, boolean dishWasherFlag) {
    brewMaster.setHasWorkToDo(coffeeFlag);
    iceBox.setHasWorkToDo(refrigeratorFlag);
    dishWasher.setHasWorkToDo(dishWasherFlag);
  }

  public void doKitchenWork() {
    brewMaster.brewCoffee();
    iceBox.orderFood();
    dishWasher.doDishes();
  }
}
