public class StringManipulation033 {
  public static void main(String[] args) {
    String birthDate = "17/02/2006";
    int startIndex = birthDate.indexOf("2006");

    System.out.printf("Birth Date: " + birthDate + "\n");
    System.out.printf("Birth Year: " + birthDate.substring(startIndex) + "\n");
    System.out.printf("Index of Birth Year: " + startIndex + "\n");
    System.out.printf("Birth Month: " + birthDate.substring(3, 5) + "\n");

    System.out.println();

    String newBirthDate1 = String.join("/", "02", "03", "2006");
    System.out.printf("New Birth Date 1: " + newBirthDate1 + "\n");

    String newBirthDate2 = "06/03";
    newBirthDate2 = newBirthDate2.concat("/");
    newBirthDate2 = newBirthDate2.concat("2006");
    System.out.printf("New Birth Date 2: " + newBirthDate2 + "\n");

    String newBirthDate3 = "17" + "/" + "08" + "/" + "2005";
    System.out.printf("New Birth Date 3: " + newBirthDate3 + "\n");

    newBirthDate3 = newBirthDate3.replace('/', '-');
    System.out.printf("\t 1) Edited Birth Date 3: " + newBirthDate3 + "\n");
    newBirthDate3 = newBirthDate3.replace('-', '/');

    newBirthDate3 = newBirthDate3.replace('2', '9');
    System.out.printf("\t 2) Edited Birth Date 3: " + newBirthDate3 + "\n");
    newBirthDate3 = newBirthDate3.replace('9', '2');

    newBirthDate3 = newBirthDate3.replaceFirst("/", "-");
    System.out.printf("\t 3) Edited Birth Date 3: " + newBirthDate3 + "\n");

    newBirthDate3 = newBirthDate3.replaceAll("/", "---");
    System.out.printf("\t 4) Edited Birth Date 3: " + newBirthDate3 + "\n");

    System.out.println();
    System.out.println("ABC \n".repeat(3));
    System.out.println("-".repeat(20));
    System.out.println("ABC \n".repeat(3).indent(8));
    System.out.println("-".repeat(20));
    System.out.println("    ABC \n".repeat(3).indent(-2));
    System.out.println("-".repeat(20));
  }
}
