// public class VariableDefinitions002 {
//   public static void main(String[] args) {
//     int var1 = 5;
//     int var2 = 10;

//     System.out.println("First Variable before = " + var1);
//     System.out.println(var1);

//     System.out.println("");

//     System.out.println("Second Variable before = " + var2);
//     System.out.println(var2);

//     var2 = 100;

//     System.out.println("");

//     System.out.println("Second Variable after = " + var2);
//     System.out.println(var2);

//     // var1 = var1 + var2;
//     var1 += var2;

//     System.out.println("");

//     System.out.println("First Variable after = " + var1);
//     System.out.println(var1);

//     int intMaxVal = Integer.MAX_VALUE;
//     int intMinVal = Integer.MIN_VALUE;
//     System.out.println("Maximum Value of Integer Variable = " + intMaxVal);
//     System.out.println("Minimum Value of Integer Variable = " + intMinVal);
//   }
// }

public class VariableDefinitions002 {
  public static void main(String[] args) {
    int var1 = 5;
    long var2 = 100L;
    char var3 = 'a';

    System.out.println("Integer Variable = " + var1);
    // System.out.println(var1);

    // System.out.println("");

    System.out.println("Integer variable has a range: (" + Integer.MIN_VALUE + ", " + Integer.MAX_VALUE + ")");
    System.out.println("Integer variable has a width: " + Integer.SIZE);

    System.out.println("");

    System.out.println("Long Integer Variable = " + var2);
    // System.out.println(var2);

    // System.out.println("");

    System.out.println("Long Integer variable has a range: (" + Long.MIN_VALUE + ", " + Long.MAX_VALUE + ")");
    System.out.println("Long Integer variable has a width: " + Long.SIZE);
  }
}
