public class FormattingOptions030 {
  public static void main(String[] args) {
    String bulletIt = "Print a bullet list: \n    \u2022 First Point \n    \u2022 Second Point";
    System.out.println(bulletIt);

    String bulletItWithTabs = "Print a bullet list: \n\t\u2022 First Point \n\t\u2022 Second Point";
    System.out.println(bulletItWithTabs);

    String textBlock = """
                          Print a bullet list:
                              \u2022 First Point
                                  \u2022 Second Point""";
    System.out.println(textBlock);

    System.out.println();

    int age = 18;
    int yearOfBirth = 2024 - age;
    System.out.printf("My age is %d. \nI was born in %d. \n", age, yearOfBirth);

    System.out.println();

    int randomNumber = 170206;
    System.out.printf("Random Number: %d \n", randomNumber);
    System.out.printf("Random Number: %f \n", (float) randomNumber);
    System.out.printf("Random Number: %.2f \n", (float) randomNumber);

    System.out.println();

    for (int i = 1; i <= 1_000_000; i *= 10) {
      System.out.printf("Printing: %7d \n", i);
    }

    System.out.println();

    String formattedString1 = String.format("Your age is %d", age++);
    System.out.println(formattedString1);

    String formattedString2 = String.format("Your age is " + ++age);
    System.out.println(formattedString2);

    String formattedString3 = ("Your age is %d").formatted(++age);
    System.out.println(formattedString3);
  }
}
