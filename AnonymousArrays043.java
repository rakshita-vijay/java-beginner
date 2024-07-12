public class AnonymousArrays043 {
  public static void main(String[] args) {
    String[] stringArray1 = {"one", "two", "three", "four"};
    for (int index = 0; index < (stringArray1.length); index++) {
      System.out.printf("Anonymous array's element #%d: '%s' %n", (index + 1), stringArray1[index]);
    }

    System.out.printf("Anonymous array's last element: '%s' %n", stringArray1[stringArray1.length - 1]);

    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

    String[] stringArray2 = new String[10];
    for (int index = 0; index < (stringArray2.length); index++) {
      System.out.printf("Anonymous array's element #%d: '%s' %n", (index + 1), stringArray2[index]);
    }
  }
}
