public class OOPsMovie039B {
  private String title;

  public OOPsMovie039B(String title) { this.title = title; }

  public void watchMovie() {
    String instanceType = this.getClass().getSimpleName();
    System.out.println("'" + title + "' is an " + instanceType + " film.");
  }

  public static OOPsMovie039B getMovie(String type, String title) {
    return switch (type.toUpperCase().charAt(0)) {
      case 'A' -> new OOPsAdventure039C(title);
      case 'C' -> new OOPsComedy039D(title);
      case 'S' -> new OOPsScienceFiction039E(title);
      default -> new OOPsMovie039B(title);
    };
  }
}
