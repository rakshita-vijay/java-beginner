import java.util.Scanner;

public class OOPsGettingInputFromUser021 {
  public static String getInputFromConsole(int currentYear) {
    String name = System.console().readLine("Hi. What's your name? ");
    System.out.println("Hi " + name + ", thanks for signing up for this trial!");

    String yob = System.console().readLine("When were you born? ");
    int yearOfBirth = Integer.parseInt(yob);
    // if double: double yearOfBirth = Double.parseDouble(yob);

    int age = currentYear - yearOfBirth;
    return "Your age is " + age + ". ";
  }

  public static String getInputFromScanner(int currentYear) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Hi. What's your name? ");
    String name = scan.nextLine();

    System.out.println("Hi " + name + ", thanks for signing up for this trial!");

    // System.out.print("When were you born? ");
    // int yearOfBirth = scan.nextInt();

    int age = 0;

    do {
      System.out.print("When were you born? ");

      // try {
      //   int yearOfBirth = scan.nextInt();
      //   age = currentYear - yearOfBirth;
      // } catch (NumberFormatException badUserData) {
      //   System.out.print("You have not entered a number. Enter a valid year. ");
      // }

      int yearOfBirth = scan.nextInt();
      age = currentYear - yearOfBirth;
    } while (age > 125 || age < 0);

    return "Your age is " + age + ". ";
  }

  public static void main(String[] args) {
    int currentYear = 2024;

    String ageFromConsole = getInputFromConsole(currentYear);
    System.out.println(ageFromConsole);

    System.out.println("");

    String ageFromScanner = getInputFromScanner(currentYear);
    System.out.println(ageFromScanner);

    // try {
    //   String ageFromConsole = getInputFromConsole(currentYear);
    //   System.out.println(ageFromConsole);
    // } catch (NullPointerException e) {
    //   String ageFromScanner = getInputFromScanner(currentYear);
    //   System.out.println(ageFromScanner);
    // }
  }
}
