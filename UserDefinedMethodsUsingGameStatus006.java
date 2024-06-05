public class UserDefinedMethodsUsingGameStatus006 {
  public static int calculateFinalScore(boolean gameStat, int finalScore, int levelCompleted, int bonus) {
    if (gameStat == true) {
    // if (gameStat) {
      finalScore += (levelCompleted * bonus);
      finalScore += 1000;
    }
    return finalScore;
  }

  public static void main(String[] args) {
    boolean gameStat = true;
    int score = 4392;
    int levelCompleted = 4;
    int bonus = 37;

    if (score == 5000) {
      System.out.println("Your score is " + score + ".");
    } else if (score > 5000) {
      System.out.println("Your score, " + score + ", is greater that 5000.");
    } else {
      System.out.println("Your score, " + score + ", is lesser that 5000. Take a bonus of " + bonus + ".");
      score += bonus;
      System.out.println("Your score is now " + score + ".");
    }

    int finalScore = score;

    finalScore = calculateFinalScore(gameStat, finalScore, levelCompleted, bonus);

    System.out.println("Your final score is " + finalScore + ".");
  }
}
