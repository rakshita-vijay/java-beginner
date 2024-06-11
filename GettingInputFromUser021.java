import java.util.Scanner;

public class GettingInputFromUser021 {
  public static String getInputFromConsole(int currentYear) {
    String name = System.console().readLine("Hi. What's your name? ");
    System.out.println("Hi " + name + ", thanks for signing up for this trial!");

    String yob = System.console().readLine("When were you born? ");
    int yearOfBirth = Integer.parseInt(yob);

    int age = currentYear - yearOfBirth;
    return "Your age is " + age + ". ";
  }

  public static String getInputFromScanner(int currentYear) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Hi. What's your name? ");
    String name = scan.nextLine();

    System.out.println("Hi " + name + ", thanks for signing up for this trial!");

    System.out.print("When were you born? ");
    int yearOfBirth = scan.nextInt();

    int age = currentYear - yearOfBirth;

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
