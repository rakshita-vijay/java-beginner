import java.util.Arrays;

public class MultiDataTypeArrays045 {
  public static void main(String[] args) {
    Object[] multiDataTypeArray = new Object[6];

    multiDataTypeArray[0] = "Hello";
    multiDataTypeArray[1] = 1;
    multiDataTypeArray[2] = "one";
    multiDataTypeArray[3] = 'a';

    int[] intArray1 = {1, 2, 3, 4, 5};
    multiDataTypeArray[4] = Arrays.toString(intArray1);

    for (int index = 0; index < (multiDataTypeArray.length); index++) {
      System.out.printf("Element #" + (index + 1) + ": " + multiDataTypeArray[index] + "\n");
    }

    System.out.println();
    System.out.println(Arrays.toString(multiDataTypeArray) + "\n");
  }
}
