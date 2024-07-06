public class OOPsComedy039D extends OOPsMovie039B {
  public OOPsComedy039D(String title) { super(title); }

  @Override
  public void watchMovie() {
    super.watchMovie();
    System.out.printf(".. %s \n".repeat(4), "Pleasant scene", "Funny scene", "Hilarious scene", "Happy Ending :)");
  }
}
