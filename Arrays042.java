public class Arrays042 {
  public static void main(String[] args) {
    int[] intArray1 = new int[10];
    for (int index = 0; index < (intArray1.length); index++) {
      System.out.printf("Element #" + (index + 1) + ": " + intArray1[index] + "\n");
    }

    System.out.println();

    intArray1[4] = 50;
    for (int index = 0; index < (intArray1.length); index++) {
      System.out.printf("Element #" + (index + 1) + ": " + intArray1[index] + "\n");
    }

    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

    double[] doubleArray1 = new double[10];
    for (int index = 0; index < (doubleArray1.length); index++) {
      System.out.printf("Element #" + (index + 1) + ": " + doubleArray1[index] + "\n");
    }

    System.out.println();

    doubleArray1[4] = 150.0;
    for (int index = 0; index < (doubleArray1.length); index++) {
      System.out.printf("Element #" + (index + 1) + ": " + doubleArray1[index] + "\n");
    }

    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

    int[] intArray2 = new int[]{1, 2, 3, 4};
    for (int index = 0; index < (intArray2.length); index++) {
      System.out.printf("Element #" + (index + 1) + ": " + intArray2[index] + "\n");
    }
  }
}
