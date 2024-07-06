import java.util.Scanner;

public class OOPsInteractivePolymorphism039Aii {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    while (true) {
      System.out.println("Your choices are: \n   \u2022 'A' for Adventure \n   \u2022 'C' for Comedy \n   \u2022 'S' for Science Fiction \n   \u2022 'Q' to Quit ");
      System.out.printf("Enter your choice: ");
      String type = scan.nextLine();

      if ("Qq".contains(type)) {
        System.out.println("You have chosen to quit.");
        break;
      }

      System.out.println();
      System.out.print("Enter movie title: ");
      String title = scan.nextLine();

      System.out.println();

      // OOPsMovie039B movie = OOPsMovie039B.getMovie(type, title);
      var movie = OOPsMovie039B.getMovie(type, title);

      if (movie.getClass().getSimpleName().contains("Comedy")) {
        OOPsComedy039D comedyMovie = (OOPsComedy039D) movie;
        comedyMovie.watchMovie();
      } else if (movie instanceof OOPsAdventure039C) {
        ((OOPsAdventure039C) movie).watchMovie();
      }
      // movie.watchMovie();
      System.out.println();
    }
  }
}
