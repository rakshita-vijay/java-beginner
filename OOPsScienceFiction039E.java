public class OOPsScienceFiction039E extends OOPsMovie039B {
  public OOPsScienceFiction039E(String title) { super(title); }

  @Override
  public void watchMovie() {
    super.watchMovie();
    System.out.printf(".. %s \n".repeat(3), "Bad Aliens come", "Space heroes chase aliens", "Planet explodes");
  }
}
