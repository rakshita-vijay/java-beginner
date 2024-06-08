public class DayOfWeekUsingSwitchCase014 {
  public static String printDayOfWeek(int day) {
    return switch (day) {
      case 0 -> "Sunday";
      case 1 -> "Monday";
      case 2 -> "Tuesday";
      case 3 -> "Wednesday";
      case 4 -> "Thursday";
      case 5 -> "Friday";
      case 6 -> "Saturday";
      default -> "Invalid";
    };
  }

  public static void main(String[] args) {
    String dayOfTheWeek = printDayOfWeek(0);
    System.out.println("When the number is " + 0 + ", the day of the week is: " + dayOfTheWeek);

    System.out.println("When the number is " + 1 + ", the day of the week is: " + printDayOfWeek(1));
    System.out.println("When the number is " + 2 + ", the day of the week is: " + printDayOfWeek(2));
    System.out.println("When the number is " + 3 + ", the day of the week is: " + printDayOfWeek(3));
    System.out.println("When the number is " + 4 + ", the day of the week is: " + printDayOfWeek(4));
    System.out.println("When the number is " + 5 + ", the day of the week is: " + printDayOfWeek(5));
    System.out.println("When the number is " + 6 + ", the day of the week is: " + printDayOfWeek(6));
    System.out.println("When the number is " + 7 + ", the day of the week is: " + printDayOfWeek(7));
  }
}
