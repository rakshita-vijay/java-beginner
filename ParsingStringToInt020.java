public class ParsingStringToInt020 {
  public static String calculatingAge(String currentYear) {
    int yearNow = Integer.parseInt(currentYear);

    String yob = "2006";
    int yearOfBirth = Integer.parseInt(yob);

    int age = yearNow - yearOfBirth;
    return "Your age is " + age + ". ";
  }

  public static void main(String[] args) {
    String currentYear = "2024";

    String ageFromConsole = getInputFromConsole(currentYear);
    System.out.println(ageFromConsole);
  }
}
