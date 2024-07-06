public class OOPsAdventure039C extends OOPsMovie039B {
  public OOPsAdventure039C(String title) { super(title); }

  @Override
  public void watchMovie() {
    super.watchMovie();
    System.out.printf(".. %s \n".repeat(3), "Pleasant scene", "Scary scene", "Bad things happen");
  }
}
