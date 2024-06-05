public class CalculationOfUserAge007 {
  public static int calcAge(int yearOfBirth) {
    return (2024 - yearOfBirth);
  }

  public static void main(String[] args) {
    int yearOfBirth = 2006;

    int age = calcAge(yearOfBirth);
    System.out.println("Your age is " + age + ".");
  }
}
