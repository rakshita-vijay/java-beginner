public class StringInspection031 {
  public static void printInformation(String stringArg) {
    if (stringArg.isEmpty()) {
      System.out.println("String is empty :(");
    } else if (stringArg.isBlank()) {
      System.out.println("String is blank :|");
    } else {
      int length = stringArg.length();

      System.out.printf("Length of '%s' is: %d \n", stringArg, length);

      System.out.printf("First character of '%s' is: '%c' \n", stringArg, stringArg.charAt(0));
      System.out.printf("Last character of '%s' is: '%c' \n", stringArg, stringArg.charAt(length - 1));
    }
  }

  public static void main(String[] args) {
    printInformation("Hello World!");

    System.out.println();
    printInformation("");

    System.out.println();
    printInformation("   ");

    System.out.println();
    printInformation("   !");

    System.out.println();
    printInformation("\t   \n");

    System.out.println();
    System.out.println("Searching for alphabet and string:");
    System.out.printf("Index of '%c' in '%s' is: %d \n", 'r', "Hello World!", "Hello World!".indexOf('r'));   // can search for an alphabet
    System.out.printf("Index of '%s' in '%s' is: %d \n", "World", "Hello World!", "Hello World!".indexOf("World"));   // can search for a string

    System.out.println();
    System.out.println("Searching for a character which dne:");
    System.out.printf("Index of '%c' in '%s' is: %d \n", 'L', "Hello World!", "Hello World!".indexOf('L'));   // return -1 if searching for a character which dne

    System.out.println();
    System.out.println("Searching for an occurence:");
    System.out.printf("Index of '%c' in '%s' is: %d \n", 'l', "Hello World!", "Hello World!".indexOf('l'));   // returns first occurence
    System.out.printf("Index of '%c' in '%s' is: %d \n", 'l', "Hello World!", "Hello World!".lastIndexOf('l'));   // returns last occurence

    System.out.println();
    System.out.println("Searching for an occurence with specified starting indices:");
    System.out.printf("Index of '%c' in '%s' is: %d \n", 'l', "Hello World!", "Hello World!".indexOf('l', 3));   // second argument is fromIndex
    System.out.printf("Index of '%c' in '%s' is: %d \n", 'l', "Hello World!", "Hello World!".lastIndexOf('l', 8));   // second argument is fromIndex
  }
}
