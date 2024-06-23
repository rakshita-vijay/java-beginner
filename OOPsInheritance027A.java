public class OOPsInheritance027A {
  public static void main(String[] args) {
    OOPsAnimal027B animal = new OOPsAnimal027B("Cat", "Small", 30);
    doAnimalStuff(animal, "Slow");
  }

  public static void doAnimalStuff(OOPsAnimal027B animal, String speed) {
    OOPsAnimal027B.move(speed);
    OOPsAnimal027B.makesNoise();
  }
}
