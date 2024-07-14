import java.util.*;

public class ReverseArray048B {

  public static void reverse(int[] intArray) {
    int arrayLength = intArray.length;

    for (int index = 0; index < (arrayLength / 2); index++) {
      int sub = intArray[index];
      intArray[index] = intArray[arrayLength - index - 1];
      intArray[arrayLength - index - 1] = sub;
    }
  }

  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the number of elements in the array: ");
    int numberOfElements = scan.nextInt();

    int[] intArray = new int[numberOfElements];

    System.out.println();

    for(int index = 0; index < numberOfElements; index++) {
      System.out.printf("Enter element #%d: ", (index + 1));
      intArray[index] = scan.nextInt();
    }

    System.out.println();
    System.out.println("Array: " + Arrays.toString(intArray));
    System.out.println();

    reverse(intArray);
    System.out.println("Reversed Array: " + Arrays.toString(intArray));
  }
}
