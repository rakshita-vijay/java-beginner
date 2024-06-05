public class StringDefinition004 {
  public static void main(String[] args) {
    String string1 = "This is the first string";

    System.out.println("The first string is: " + string1);

    string1 += ", with a continuation :P";

    System.out.println("The edited first string is: " + string1);

    int int1 = 50;

    string1 += " ";
    string1 += int1;

    System.out.println("The edited first string with the number is: " + string1);
  }
}
