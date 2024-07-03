public class StringBuilder034 {
  public static void printInformation(String string) {
    System.out.printf("String: '" + string + "'\n");
    System.out.printf("String length: " + string.length() + "\n");
  }

  public static void printInformation(StringBuilder stringBuilder) {
    System.out.println("String Builder: ");
    System.out.println("--------------");
    System.out.printf("String: '" + stringBuilder + "'\n");
    System.out.printf("String length: " + stringBuilder.length() + "\n");
    System.out.printf("Capacity of StringBuilder: " + stringBuilder.capacity() + "\n");
  }

  public static void printDemarcater() {
    System.out.println("\n~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~ \n");
  }

  public static void main(String[] args) {
    String helloWorld = "Hello " + "World!";
    StringBuilder helloWorldBuilder = new StringBuilder("Hello " + "World" + "!" + " :)");

    printInformation(helloWorld);

    System.out.println();
    helloWorld = helloWorld.concat(" Nice to meet you!");
    printInformation(helloWorld);

    printDemarcater();

    printInformation(helloWorldBuilder);

    System.out.println();
    // helloWorldBuilder.append("\nGoodbye!".indent(("String in StringBuilder: '").length()));
    helloWorldBuilder.append(" Goodbye!");
    printInformation(helloWorldBuilder);

    printDemarcater();

    StringBuilder emptyString = new StringBuilder();
    StringBuilder emptyStringWithCapacity = new StringBuilder(32);

    printInformation(emptyString);
    System.out.println();
    printInformation(emptyStringWithCapacity);

    printDemarcater();

    emptyString.append("a".repeat(17));
    printInformation(emptyString);

    System.out.println();
    emptyStringWithCapacity.append("a".repeat(34));
    printInformation(emptyStringWithCapacity);

    printDemarcater();

    int index = helloWorldBuilder.indexOf("G");
    char upperAlpha = helloWorldBuilder.charAt(index);
    helloWorldBuilder.deleteCharAt(index).insert(index, String.valueOf(upperAlpha).toLowerCase());
    printInformation(helloWorldBuilder);
    helloWorldBuilder.deleteCharAt(index).insert(index, String.valueOf(upperAlpha).toUpperCase());

    printDemarcater();

    helloWorldBuilder.reverse();
    printInformation(helloWorldBuilder);

    System.out.println();
    helloWorldBuilder.setLength(7);
    printInformation(helloWorldBuilder);
  }
}
