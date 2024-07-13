import java.util.*;

public class MinimumElement050 {
  public static int[] readIntegers() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the integers delimited with a ', ': ");
    String listOfIntegers = scan.nextLine();
    String[] integerList = listOfIntegers.split(", ");
    int[] intArray = new int[integerList.length];

    for (int index = 0; index < integerList.length; index++) {
      intArray[index] = Integer.parseInt(integerList[index]);
    }

    return intArray;
  }

  public static int findMin(int[] intArray) {
    Arrays.sort(intArray);
    return intArray[0];
  }

  public static int findMax(int[] intArray) {
    Arrays.sort(intArray);
    return intArray[intArray.length - 1];
  }

  public static void main(String... args) {
    int[] intArray = readIntegers();

    System.out.println("Array: " + Arrays.toString(intArray));

    System.out.println("Minimum Value: " + findMin(intArray));
    System.out.println("Maximum Value: " + findMax(intArray));
  }
}
