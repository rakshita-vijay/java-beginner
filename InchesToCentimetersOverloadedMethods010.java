public class InchesToCentimetersOverloadedMethods010 {
  public static double convertToCentimeters(int heightInInches) {
    double heightinCm = ((double) heightInInches) * 2.54D;
    return heightinCm;
  }

  public static double convertToCentimeters(int heightInFeet, int heightInInches) {
    int totalHeightInInches = (heightInFeet * 12) + heightInInches;
    double heightinCm = convertToCentimeters(totalHeightInInches);
    return heightinCm;
  }

  public static void main(String[] args) {
    double firstCall = convertToCentimeters(68);
    double secondCall = convertToCentimeters(5, 8);

    System.out.println("Using first method, the height in centimeters is: " + firstCall + " cm.");
    System.out.println("Using second method, the height in centimeters is: " + secondCall + " cm.");
    System.out.println("We can see that the heights are the " + ((firstCall == secondCall) ? "same." : "different."));
  }
}
