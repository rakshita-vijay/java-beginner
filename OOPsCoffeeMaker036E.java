public class OOPsCoffeeMaker036E {
  private boolean hasWorkToDo;

  // public boolean getHasWorkToDo() { return hasWorkToDo; }

  public void setHasWorkToDo(boolean hasWorkToDo) {
    this.hasWorkToDo = hasWorkToDo;
  }

  public void brewCoffee() {
    if (hasWorkToDo) {
      System.out.println("Coffee is being brewed.");
      hasWorkToDo = false;
    }
  }
}
