public class PrimeNumber016 {
  public static boolean isPrimeNumber(int number) {
    if (number < 2) {
      return false;
    } else if (number == 2) {
      return true;
    }
    for (int count = 2; count <= (number / 2); count++) {
      if (number % count == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int count = 0;
    for (int number = 0; number <= 1000; number++) {
      // System.out.println(number + " is" + ((isPrimeNumber(number) == true) ? "" : " not") + " a prime number.");

      count += ((isPrimeNumber(number)) ? 1 : 0);
      if (isPrimeNumber(number) == true) {
        System.out.println(number + " is a prime number.");
      } else {
        System.out.print("");
      }

      if (count == 13) {
        break;
      }
    }
  }
}
