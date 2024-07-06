public class OOPsPolymorphism039Ai {
  public static void main(String[] args) {
    OOPsMovie039B movie1 = new OOPsMovie039B("Now You See Me");
    OOPsMovie039B movie2 = new OOPsAdventure039C("Malory Towers");
    OOPsMovie039B movie3 = new OOPsComedy039D("The Upside");
    OOPsMovie039B movie4 = new OOPsScienceFiction039E("Legends of Tomorrow");

    OOPsMovie039B movie5 = OOPsMovie039B.getMovie("Adventure", "Lucifer");
    OOPsMovie039B movie6 = OOPsMovie039B.getMovie("Horror", "World War Z");

    movie1.watchMovie();
    System.out.println();

    movie2.watchMovie();
    System.out.println();

    movie3.watchMovie();
    System.out.println();

    movie4.watchMovie();
    System.out.println();

    movie5.watchMovie();
    System.out.println();

    movie6.watchMovie();
    System.out.println();
  }
}
