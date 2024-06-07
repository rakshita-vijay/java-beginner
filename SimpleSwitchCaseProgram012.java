public class SimpleSwitchCaseProgram012 {
  public static void main(String[] args) {
    int val = 4;
    switch (val) {
      case 1:
        System.out.println("Value is 1.");
        break;
      case 2:
        System.out.println("Value is 2.");
        break;
      case 3:
        System.out.println("Value is 3.");
        break;
      default:
        System.out.println("Value is not 1, 2, or 3.");
    }

    char alph1 = 'a';
    switch (alph1) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
        System.out.println("" + alph1 + " is a vowel.");
        break;
      default:
        System.out.println("" + alph1 + " is not a vowel. It's a consonant.");
    }

    char alph2 = 'j';
    switch (alph2) {
      case 'a' -> System.out.println("" + alph2 + " is a vowel.");
      case 'e', 'i', 'o', 'u' -> System.out.println("" + alph2 + " is a vowel.");
      default -> System.out.println("" + alph2 + " is not a vowel. It's a consonant.");
    }
  }
}
