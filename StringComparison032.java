public class StringComparison032 {
  public static void main(String[] args) {
    String helloWorld = "Hello World!";
    String helloWorldLower = helloWorld.toLowerCase();

    if(helloWorld.equals(helloWorldLower)) {
      System.out.printf("helloWorld = helloWorldLower, i.e., '%s' = '%s' \n", helloWorld, helloWorldLower);
    } else if (helloWorld.equalsIgnoreCase(helloWorldLower)) {
      System.out.printf("When we ignore case, helloWorld = helloWorldLower, i.e., '%s' = '%s' \n", helloWorld, helloWorldLower);
    } else {
      System.out.printf("helloWorld != helloWorldLower, i.e., '%s' != '%s' \n", helloWorld, helloWorldLower);
    }

    if (helloWorld.startsWith("Hello")) {
      System.out.printf("'%s' starts with '%s' \n", helloWorld, "Hello");
    } else {
      System.out.printf("'%s' does not start with '%s' \n", helloWorld, "Hello");
    }

    if (helloWorld.endsWith("World")) {
      System.out.printf("'%s' ends with '%s' \n", helloWorld, "World");
    } else {
      System.out.printf("'%s' does not end with '%s' \n", helloWorld, "World");
    }

    if (helloWorld.contains("x")) {
      System.out.printf("'%s' contains '%s' \n", helloWorld, "x");
    } else {
      System.out.printf("'%s' does not contain '%s' \n", helloWorld, "x");
    }

    if (helloWorld.contentEquals("World")) {
      System.out.printf("Content matches exactly: '%s' = '%s' \n", helloWorld, "World");
    } else {
      System.out.printf("Content does not match exactly: '%s' != '%s' \n", helloWorld, "World");
    }
  }
}
