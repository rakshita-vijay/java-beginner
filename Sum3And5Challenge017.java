public class Sum3And5Challenge017 {
  public static void main(String[] args) {
    int sum = 0;
    int counter = 0;
    for(int number = 1; number <= 1000; number++) {
      // if (number % 3 == 0 && number % 15 != 0) {
      //   sum += number;
      //   System.out.println(number);
      //   counter++;
      // }
      // if (number % 5 == 0 && number % 15 != 0) {
      //   sum += number;
      //   System.out.println(number);
      //   counter++;
      // }
      if (number % 15 == 0) {
        sum += number;
        System.out.println(number);
        counter++;
      }
    }
    System.out.println("");
    System.out.println("There are " + counter + " numbers between 1 and 1000 that are divisible by both 3 and 5.");
    System.out.println("Their sum is: " + sum);
  }
}
