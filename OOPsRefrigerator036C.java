public class OOPsRefrigerator036C {
  private boolean hasWorkToDo;

  // public boolean getHasWorkToDo() { return hasWorkToDo; }

  public void setHasWorkToDo(boolean hasWorkToDo) {
    this.hasWorkToDo = hasWorkToDo;
  }

  public void orderFood() {
    if (hasWorkToDo) {
      System.out.println("Food is being ordered.");
      hasWorkToDo = false;
    }
  }
}
