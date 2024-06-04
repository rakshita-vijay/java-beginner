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
    short var3 = 5, var4 = 6;
    byte var5 = 7; byte var6 = 8;
    byte var7 = (Byte.MIN_VALUE / 2);
    // byte var7 = (byte) (Byte.MIN_VALUE / 2);   // example of casting
    char var8 = 'a';
    long var9 = 50_000L + (10 * (var6 + var3 + var1));
    float var10 = 12F;
    double var11 = 13D;
    double var12 = var11 / (double) var10;
    double var13 = 13D / 12D;

    System.out.println("Integer Variable = " + var1);
    // System.out.println(var1);

    // System.out.println("");

    System.out.println("Integer variable has a range: (" + Integer.MIN_VALUE + ", " + Integer.MAX_VALUE + ")");
    System.out.println("Integer variable has a width: " + Integer.SIZE);

    System.out.println("");

    System.out.println("Long Variable = " + var2);
    // System.out.println(var2);

    // System.out.println("");

    System.out.println("Long variable has a range: (" + Long.MIN_VALUE + ", " + Long.MAX_VALUE + ")");
    System.out.println("Long variable has a width: " + Long.SIZE);

    System.out.println("");

    System.out.println("Short Variable 1 = " + var3);
    System.out.println("Short Variable 2 = " + var4);
    System.out.println("Byte Variable 1 = " + var5);
    System.out.println("Byte Variable 2 = " + var6);
    System.out.println("Byte Variable 3 = " + var7);
    System.out.println("Character Variable 1 = " + var8);
    System.out.println("Long Variable for sum = " + var9);

    System.out.println("");

    System.out.println("Float Variable = " + var10);
    System.out.println("Float variable has a range: (" + Float.MIN_VALUE + ", " + Float.MAX_VALUE + ")");
    System.out.println("Float variable has a width: " + Float.SIZE);

    System.out.println("");

    System.out.println("Double Variable = " + var11);
    System.out.println("Double variable has a range: (" + Double.MIN_VALUE + ", " + Double.MAX_VALUE + ")");
    System.out.println("Double variable has a width: " + Double.SIZE);

    System.out.println("");

    System.out.println("Divided Double Variable 1 = " + var12);
    System.out.println("Divided Double Variable 2 = " + var13);
  }
}
