public class OOPsEncapsulation037A {
  public static void printDetails(OOPsPlayer037B player) {
    System.out.println("Name: " + player.name + "\nHealth: " + player.health + "\nWeapon: " + player.weapon);
  }

  public static void main(String[] args) {

    // player.name = "Rakshita";
    // player.health = 18;
    // player.weapon = "Sword";

    OOPsPlayer037B player1 = new OOPsPlayer037B("Rakshita");
    OOPsPlayer037B player2 = new OOPsPlayer037B("Arvi", 18, "Lightsaber");
    OOPsPlayer037B player3 = new OOPsPlayer037B("Mayhem", 200, "Chainsaw");

    // System.out.println("Name: " + player1.name + "\nHealth: " + player1.health + "\nWeapon: " + player1.weapon);
    printDetails(player1);
    System.out.println();

    player1.loseHealth(10);
    printDetails(player1);
    System.out.println();

    player1.restoreHealth(30);
    System.out.println("Name: " + player1.name + "\nHealth: " + player1.health + "\nWeapon: " + player1.weapon);
    System.out.println();

    player1.loseHealth(40);
    System.out.println("Name: " + player1.name + "\nHealth: " + player1.health + "\nWeapon: " + player1.weapon);

    System.out.println();
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println();

    System.out.println("Name: " + player2.name + "\nHealth: " + player2.health + "\nWeapon: " + player2.weapon);
    System.out.println();

    player2.loseHealth(10);
    System.out.println("Name: " + player2.name + "\nHealth: " + player2.health + "\nWeapon: " + player2.weapon);
    System.out.println();

    player2.restoreHealth(30);
    System.out.println("Name: " + player2.name + "\nHealth: " + player2.health + "\nWeapon: " + player2.weapon);
    System.out.println();

    player2.loseHealth(40);
    System.out.println("Name: " + player2.name + "\nHealth: " + player2.health + "\nWeapon: " + player2.weapon);

    System.out.println();
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println();

    System.out.println("Name: " + player3.name + "\nHealth: " + player3.health + "\nWeapon: " + player3.weapon);
    System.out.println();

    player3.loseHealth(10);
    System.out.println("Name: " + player3.name + "\nHealth: " + player3.health + "\nWeapon: " + player3.weapon);
    System.out.println();

    player3.restoreHealth(30);
    System.out.println("Name: " + player3.name + "\nHealth: " + player3.health + "\nWeapon: " + player3.weapon);
    System.out.println();

    player3.loseHealth(40);
    System.out.println("Name: " + player3.name + "\nHealth: " + player3.health + "\nWeapon: " + player3.weapon);
  }
}
