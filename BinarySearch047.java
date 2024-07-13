import java.util.*;

public class BinarySearch047 {
  public static void main(String[] args) {
    String[] stringArray1 = {"Adam", "Dave", "Bob", "Emilia", "Carla"};
    Arrays.sort(stringArray1);
    System.out.println("Sorted array: " + Arrays.toString(stringArray1));

    if (Arrays.binarySearch(stringArray1, "Mark") >= 0) {
      System.out.println("Mark is in the list! Hi Mark!");
    } else {
      System.out.println("Mark is not in the list :(");
    }

    // searching if strings are equal - technically comes under this?

    int[] intArray1 = {1, 2, 3, 4, 5};
    int[] intArray2 = {1, 2, 3, 4, 5, 0};

    int[] intArray3 = intArray1;
    int[] intArray4 = Arrays.copyOf(intArray1, intArray1.length);

    if (Arrays.equals(intArray1, intArray2)) {
      System.out.println("intArray1 and intArray2 are equal");
    } else {
      System.out.println("intArray1 and intArray2 are not equal :(");
    }

    if (Arrays.equals(intArray1, intArray3)) {
      System.out.println("intArray1 and intArray3 are equal");
    } else {
      System.out.println("intArray1 and intArray3 are not equal :(");
    }

    if (Arrays.equals(intArray1, intArray4)) {
      System.out.println("intArray1 and intArray4 are equal");
    } else {
      System.out.println("intArray1 and intArray4 are not equal :(");
    }

    if (Arrays.equals(intArray3, intArray4)) {
      System.out.println("intArray3 and intArray4 are equal");
    } else {
      System.out.println("intArray3 and intArray4 are not equal :(");
    }
  }
}
