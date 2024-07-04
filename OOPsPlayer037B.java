public class OOPsPlayer037B {
  public String name;
  public int health;
  public String weapon;

  // private String name;
  // private int health;
  // private String weapon;

  public OOPsPlayer037B() {}

  public OOPsPlayer037B(String name) {
    this(name, 100, "Sword");
  }

  public OOPsPlayer037B(String name, int health, String weapon) {
    this.name = name;
    this.health = (health < 0) ? 0 : ((health > 100) ? 100 : health);
    this.weapon = weapon;
  }

  public void loseHealth(int damage) {
    health -= damage;
    if(health <= 0) {
      System.out.println("Player has been knocked out of the game. Final Statistics:");
      health = 0;
    }
  }

  public void restoreHealth(int extraHealth) {
    health += extraHealth;
    if(health > 100) {
      System.out.println("Player's health has been conpletely restored.");
      health = 100;
    }
  }

  public int healthRemaining() {
    return health;
  }
}
