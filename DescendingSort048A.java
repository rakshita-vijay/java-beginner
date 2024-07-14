import java.util.*;

public class DescendingSort048A {
  public static void main(String[] args) {
    Random random = new Random();
    int[] intArray = new int[3];
    int arrayLength = intArray.length;

    for (int index = 0; index < arrayLength; index++) {
      intArray[index] = random.nextInt(100);
    }

    System.out.println("Randomly generated array: " + Arrays.toString(intArray));

    Arrays.sort(intArray);
    System.out.println("Sorted array: " + Arrays.toString(intArray));

    for (int index = 0; index < (arrayLength / 2); index++) {
      int sub = intArray[index];
      intArray[index] = intArray[arrayLength - index - 1];
      intArray[arrayLength - index - 1] = sub;
    }

    System.out.println("Array in descending order: " + Arrays.toString(intArray));
  }
}
