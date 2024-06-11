public class ParsingStringToIntandDouble020 {
  public static String getInputFromConsole(int currentYear) {
    String name = System.console().readLine("Hi. What's your name? ");
    System.out.println("Hi " + name + ", thanks for signing up for this trial!");

    String yob = System.console().readLine("When were you born? ");
    int yearOfBirth = Integer.parseInt(yob);

    int age = currentYear - yearOfBirth;
    return "Your age is " + age + ". ";
  }

  public static void main(String[] args) {
    int currentYear = 2024;
    String ageFromConsole = getInputFromConsole(currentYear);
    System.out.println(ageFromConsole);
  }
}
