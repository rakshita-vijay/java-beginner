import java.util.Scanner;

public class MinAndMaxChallenge023 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int minNum = 0;
    int maxNum = 0;
    int count = 0;

    System.out.println("Enter numbers to find minimum and maximum. If you want to exit, enter an alphabet.");

    boolean choice = true;

    while (choice) {
    // while (true) {
      String inputNum = scan.nextLine();
      try {
        int inputNumber = Integer.parseInt(inputNum);
        if (count == 0 || inputNumber < minNum) {
          minNum = inputNumber;
        }
        if (count == 0 || inputNumber > maxNum) {
          maxNum = inputNumber;
        }
        count++;
      } catch (NumberFormatException nfe) {
        // System.out.println("Number not entered.");

        // System.out.print("Do you want to continue? Enter yes or no: ");
        // String ans = scan.nextLine();
        // choice = ((ans == "yes" || ans == "y" || ans == "YES" || ans == "Y") ? true : false);

        // if (choice == true) {
        //   System.out.print("Enter a valid number: ");
        // }
        break;
      }
    }

    System.out.println("Smallest number entered: " + minNum);
    System.out.println("Largest number entered: " + maxNum);
  }
}
