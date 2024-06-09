public class TestEven018 {
  public static boolean isEvenNumber(int number) {
    return ((number % 2) == 0) ? true : false;
  }

  public static void main(String[] args) {
    int startNumber = 5;
    int endNumber = 20;
    int numberOfEvens = 0;
    int numberOfOdds = 0;
    while (startNumber <= endNumber) {
      if (isEvenNumber(startNumber)) {
        System.out.println(startNumber + " is an even number.");
        numberOfEvens++;
        if (numberOfEvens == 5) {
          break;
        }
      } else {
        numberOfOdds++;
      }
      startNumber++;
    }
    System.out.println("");
    System.out.println("There are " + numberOfEvens + " even numbers.");
    System.out.println("There are " + numberOfOdds + " odd numbers.");
  }
}
