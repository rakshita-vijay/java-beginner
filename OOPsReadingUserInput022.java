import java.util.Scanner;

public class OOPsReadingUserInput022 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int counter = 1;
    int sum  = 0;

    do {
      System.out.print("Enter number " + counter + ": ");
      String num = scan.nextLine();

      try {
        int number = Integer.parseInt(num);
        counter++;
        sum += number;
        // System.out.println();
      } catch (NumberFormatException nfe) {
        System.out.println("Invalid number.");
      }
    } while (counter <= 5);

    System.out.println();
    System.out.println("Sum: " + sum);
  }
}
