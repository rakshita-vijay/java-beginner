public class ConvertingSecondsToHMS009 {
  public static void main(String[] args) {
    int numOfSeconds = -3945;
    if (numOfSeconds < 0) {
      System.out.println("The number of seconds entered is less than zero, so it is rounded up to be: ");
      printingNumberOfHMS(0, 0, 0);
    } else {
      StoMS(numOfSeconds);
    }
  }

  public static void StoMS(int numberOfSeconds) {
    int numOfMinutes = numberOfSeconds / 60;
    numberOfSeconds %= 60;
    MStoHMS(numOfMinutes, numberOfSeconds);
  }

  public static void MStoHMS(int numOfMinutes, int numberOfSeconds) {
    int numOfHours = numOfMinutes / 60;
    numOfMinutes %= 60;
    printingNumberOfHMS(numOfHours, numOfMinutes, numberOfSeconds);
  }

  public static void printingNumberOfHMS(int numOfHours, int numOfMinutes, int numberOfSeconds) {
    System.out.println("Number of Hours: " + numOfHours);
    System.out.println("Number of Minutes: " + numOfMinutes);
    System.out.println("Number of Seconds: " + numberOfSeconds);
  }
}
