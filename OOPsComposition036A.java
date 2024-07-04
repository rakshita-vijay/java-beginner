public class OOPsComposition036A {
  public static void main(String[] args) {
    OOPsSmartKitchen036B smartKitchen = new OOPsSmartKitchen036B();

    // // parah 1 & 2 - package deal
    // smartKitchen.getIceBox().setHasWorkToDo(true);
    // smartKitchen.getBrewMaster().setHasWorkToDo(true);
    // smartKitchen.getDishWasher().setHasWorkToDo(true);

    // // for all three to execute as true
    // smartKitchen.getIceBox().orderFood();
    // smartKitchen.getBrewMaster().brewCoffee();
    // smartKitchen.getDishWasher().doDishes();

    // for individual settings
    smartKitchen.setKitchenState(true, true, false);
    smartKitchen.doKitchenWork();

    System.out.println();

    smartKitchen.setKitchenState(false, true, false);
    smartKitchen.doKitchenWork();
  }
}
