public class SimpleInterest015 {
  public static double calculateSimpleInterest(double principalAmount, double rateOfInterest, double timePeriod) {
    return ((principalAmount * rateOfInterest * timePeriod) / 100);
  }
  public static void main(String[] args) {
    for (int counter = 0; counter < 5; counter++) {
      System.out.print((counter + 1) + ") ");
      System.out.println("When principal amount is " + 10_000 + ", rate of interest is " + (counter + 2) + ", and time period (in years) is " + 1 + ", the simple interest is: " + calculateSimpleInterest(10_000.00, (counter + 2), 1));
    }

    System.out.println("");

    for (double counter = 7.5; counter < 10.25; counter += 0.25) {
      System.out.println("When principal amount is " + 100 + ", rate of interest is " + counter + ", and time period (in years) is " + 1 + ", the simple interest is: " + calculateSimpleInterest(100.00, counter, 1));
    }
  }
}
