public class HighScore008 {
  public static int calcHighScorePosition(int score) {
    if (score >= 1000) {
      return 1;
    } else if (score >= 500) {
      return 2;
    } else if (score >= 100) {
      return 3;
    } else {
      return 4;
    }
  }

  public static void displayHighScorePosition(String name, int score, int highScorePosition) {
    System.out.println(name + " (score: " + score + ") got into position " + highScorePosition + " on the high score list.");
  }

  public static void main(String[] args) {
    int highScorePosition = calcHighScorePosition(1500);
    displayHighScorePosition(args[0], 1500, highScorePosition);

    highScorePosition = calcHighScorePosition(1000);
    displayHighScorePosition(args[1], 1000, highScorePosition);

    highScorePosition = calcHighScorePosition(999);
    displayHighScorePosition(args[2], 999, highScorePosition);

    highScorePosition = calcHighScorePosition(500);
    displayHighScorePosition(args[3], 500, highScorePosition);

    highScorePosition = calcHighScorePosition(499);
    displayHighScorePosition(args[4], 499, highScorePosition);

    highScorePosition = calcHighScorePosition(100);
    displayHighScorePosition(args[5], 100, highScorePosition);

    highScorePosition = calcHighScorePosition(99);
    displayHighScorePosition(args[6], 99, highScorePosition);

    highScorePosition = calcHighScorePosition(25);
    displayHighScorePosition(args[7], 25, highScorePosition);
  }
}
