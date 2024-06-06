public class StoHMSOverloadedMethods011 {
  // // 2 calling 1
  // public static String getDurationString(int seconds) {
  //   if (seconds < 0) {
  //     return seconds + " seconds is an invalid input.";
  //   } else {
  //     int secondsCopy = seconds;
  //     int minutes = seconds / 60;
  //     seconds %= 60;
  //     int hours = minutes / 60;
  //     minutes %= 60;
  //     return "" + secondsCopy + " seconds = " + hours + "h " + minutes + "m " + seconds + "s";
  //   }
  // }

  // public static String getDurationString(int minutes, int seconds) {
  //   if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
  //     return ((minutes < 0) ? minutes + " minutes" : seconds + " seconds") + " is an invalid input.";
  //   } else {
  //     int totalSeconds = (minutes * 60) + seconds;
  //     return "" + minutes + " minutes and " + seconds + " seconds = " + getDurationString(totalSeconds);
  //   }
  // }

  // 1 calling 2
  public static String getDurationString(int seconds) {
    if (seconds < 0) {
      return seconds + " seconds is an invalid input.";
    } else {
      int minutes = seconds / 60;
      int secondsCopy = seconds % 60;
      return "" + seconds + " seconds = " + getDurationString(minutes, secondsCopy);
    }
  }

  public static String getDurationString(int minutes, int seconds) {
    if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
      return ((minutes < 0) ? minutes + " minutes" : seconds + " seconds") + " is an invalid input.";
    } else {
      int hours = minutes / 60;
      int minutesCopy = minutes % 60;
      return "" + minutes + " minutes and " + seconds + " seconds = " + hours + "h " + minutesCopy + "m " + seconds + "s";
    }
  }

  public static void main(String[] args) {
    System.out.println("Calling the first method: " + getDurationString(3945));
    System.out.println("Calling the second method: " + getDurationString(65, 45));
  }
}
