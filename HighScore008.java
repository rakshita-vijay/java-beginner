public class HighScore008 {
  public static int calcHighScorePosition(int score) {
    if (score >= 1000) {
      return 1;
    } else if (score < 1000 && score >= 500) {
      return 2;
    } else if (score < 500 && score >= 100) {
      return 3;
    } else {
      return 4;
    }
  }

  public static void displayHighScorePosition(String name, int highScorePosition) {
    System.out.println(name + " got into position " + highScorePosition + " on the high score list.");
  }

  public static void main(String[] args) {
    int valScore = 25;
    int highScorePosition = calcHighScorePosition(valScore);
    displayHighScorePosition(args[0], highScorePosition);
  }
}
