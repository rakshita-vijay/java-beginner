import java.util.Arrays;

public class EnhancedForLoops044 {
  public static void main(String[] args) {
    int[] intArray1 = {1, 2, 3, 4, 5};

    for (int element : intArray1) {
      System.out.println(element + " ");
    }

    System.out.println();
    System.out.println(intArray1);

    String arrayElements = Arrays.toString(intArray1);
    System.out.println(arrayElements);

    System.out.println();

    Object objectVariable = intArray1;
    if (objectVariable instanceof int[]) {
      System.out.println("objectVariable is really an instance of an integer array!");
    }
  }
}
