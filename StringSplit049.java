// import java.util.*;

public class StringSplit049 {
  public static void printText(String... splitString1) {
    for (String word : splitString1) {
      System.out.println(word);
    }
  }
  public static void main(String... args) {
    String[] splitString1 = "Hello World! :)".split(" ");

    // System.out.println(Arrays.toString(splitString1));

    printText(splitString1);

    System.out.println();

    String[] splitString2 = {"first", "second", "third", "fourth", "fifth"};
    printText(String.join(", ", splitString2));

    System.out.println();

    printText("Hi");
  }
}
