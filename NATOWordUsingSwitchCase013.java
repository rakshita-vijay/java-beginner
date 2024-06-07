public class NATOWordUsingSwitchCase013 {
  public static String printTheNATOWord(char alph) {
    return switch (alph) {
      case 'a' -> "Alpha";
      case 'b' -> "Bravo";
      case 'c' -> "Charlie";
      case 'd' -> "Delta";
      case 'e' -> "Echo";
      case 'f' -> "Foxtrot";
      case 'g' -> "Golf";
      case 'h' -> "Hotel";
      case 'i' -> "India";
      case 'j' -> "Juliett";
      case 'k' -> "Kilo";
      case 'l' -> "Lima";
      case 'm' -> "Mike";
      case 'n' -> "November";
      case 'o' -> "Oscar";
      case 'p' -> "Papa";
      case 'q' -> "Quebec";
      case 'r' -> "Romeo";
      case 's' -> "Sierra";
      case 't' -> "Tango";
      case 'u' -> "Uniform";
      case 'v' -> "Victor";
      case 'w' -> "Whiskey";
      case 'x' -> "X-ray";
      case 'y' -> "Yankee";
      case 'z' -> "Zulu";
      default -> "Not found in database";
    };
  }

  public static void main(String[] args) {
    char alph = 'v';
    System.out.println("The NATO Word for " + alph + " is: " + printTheNATOWord(alph));
  }
}
