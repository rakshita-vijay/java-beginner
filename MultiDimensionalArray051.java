import java.util.Arrays;

public class MultiDimensionalArray051 {
  public static void main(String[] args) {
    int[][] intArray1 = { {1, 2, 3}, {11, 12, 13}, {21, 22, 23}, {31, 32, 33} };

    int[][] intArray2 = { {1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4} };

    int[][] intArray3 = new int[3][];

    System.out.println("Array 1: " + Arrays.toString(intArray1));
    System.out.println("Array 2: " + Arrays.toString(intArray2));

    System.out.println("Array 1: " + intArray1.length);

    System.out.println();

    for(int index = 0; index < intArray2.length; index++) {
      System.out.println(Arrays.toString(intArray2[index]));
    }

    System.out.println();

    for(int outerIndex = 0; outerIndex < intArray2.length; outerIndex++) {
      System.out.print("[");
      for(int innerIndex = 0; innerIndex < intArray2[outerIndex].length; innerIndex++) {
        System.out.print(intArray2[outerIndex][innerIndex]);
        System.out.print((innerIndex != (intArray2[outerIndex].length - 1)) ? ", " : "");
      }
      System.out.println("]");
    }

    System.out.println();

    System.out.println(Arrays.deepToString(intArray2));

    intArray2[3] = new int[] {1, 2, 3, 4, 5};
    System.out.println(Arrays.deepToString(intArray2));

    System.out.println();

    Object[] anyArray = new Object[3];

    anyArray[0] = new String[] {"a", "b", "c"};

    anyArray[1] = new String[][] { {"one", "two", "three"}, {"four", "five", "six", "seven", "eight"} };

    anyArray[2] = new int[2][2][2];
    // anyArray[2] = "Hello";
    System.out.println(Arrays.deepToString(anyArray));

    System.out.println();

    for (Object element: anyArray) {
      System.out.println("Element type: " + element.getClass().getSimpleName());
      System.out.println("Element toString(): " + element);
      System.out.println(Arrays.deepToString((Object[]) element));

      System.out.println();
    }
  }
}
