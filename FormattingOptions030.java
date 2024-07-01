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
    System.out.printf("Age is %d", age);
  }
}
