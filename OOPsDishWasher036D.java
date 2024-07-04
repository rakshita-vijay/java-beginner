public class OOPsDishWasher036D {
  private boolean hasWorkToDo;

  // public boolean getHasWorkToDo() { return hasWorkToDo; }

  public void setHasWorkToDo(boolean hasWorkToDo) {
    this.hasWorkToDo = hasWorkToDo;
  }

  public void doDishes() {
    if (hasWorkToDo) {
      System.out.println("Dishes are being washed.");
      hasWorkToDo = false;
    }
  }
}
