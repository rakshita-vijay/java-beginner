import java.util.*;

public class RandomNumberGeneration046 {
  private static int[] randomNumberArrayGeneration(int length) {
    Random random = new Random();
    int[] intArray = new int[length];

    for (int index = 0; index < length; index++) {
      intArray[index] = random.nextInt(100);
    }

    return intArray;
  }

  public static void main(String[] args) {
    int[] intArray1 = randomNumberArrayGeneration(10);
    System.out.println("Random array generated: " + Arrays.toString(intArray1));

    int[] intArray2 = Arrays.copyOf(intArray1, 12);

    Arrays.sort(intArray1);
    System.out.println("Sorted array: " + Arrays.toString(intArray1));

    System.out.println();
    System.out.println("intArray2: " + Arrays.toString(intArray2));

    System.out.println();
    Arrays.fill(intArray1, 5);
    System.out.println("Array filled with 5: " + Arrays.toString(intArray1));
  }
}
