public class SumOfDigits019 {
  public static int sumDigits(int number) {
    if (number < 0) {
      return -1;
    } else if (number < 10) {
      System.out.print("Sum of digits of " + number + " is: ");
      return number;
    } else {
      System.out.print("Sum of digits of " + number + " is: ");
      int numberCopy1 = number;
      int numberOfDigits = 0;
      int sum = 0;

      while (numberCopy1 > 0) {
        sum += (numberCopy1 % 10);
        numberCopy1 /= 10;
        numberOfDigits++;
      }

      int numberCopy2 = number;
      int numberRev = 0;
      int numberOfDigitsCopy = numberOfDigits;
      for (int count = 0; count < numberOfDigitsCopy; count++) {
        numberRev += ((numberCopy2 % 10) * (Math.pow(10, (numberOfDigits - 1))));
        numberCopy2 /= 10;
        numberOfDigits--;
      }

      for (int count = 0; count < numberOfDigitsCopy; count++) {
        System.out.print(numberRev % 10);
        numberRev /= 10;
        if (numberRev <= 0) {
          break;
        } else {
          System.out.print(" + ");
        }
      }
      System.out.print(" = ");
      return sum;
    }
  }

  public static void main(String[] args) {
    int sumOfDigits = sumDigits(20500);
    System.out.println(sumOfDigits);

    System.out.println(sumDigits(5000));
    System.out.println(sumDigits(1234));
    System.out.println(sumDigits(-125));
    System.out.println(sumDigits(4));
    System.out.println(sumDigits(32));
  }
}
