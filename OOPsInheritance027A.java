public class OOPsInheritance027A {
  public static void main(String[] args) {
    OOPsAnimal027B animal = new OOPsAnimal027B("Cat", "Small", 30);   // this assigns it to the fields
    doAnimalStuff(animal, "Slow");

    System.out.println();
    OOPsDog027C dog = new OOPsDog027C();
    doAnimalStuff(dog, "Fast");

    System.out.println();
    OOPsDog027C yorkie = new OOPsDog027C("Yorkie", 15);
    doAnimalStuff(yorkie, "Fast");

    System.out.println();
    OOPsDog027C retriever = new OOPsDog027C("Labrador Retriever", 65, "Floppy", "Swimmer");
    doAnimalStuff(retriever, "Slow");

    System.out.println();
    OOPsDog027C wolf = new OOPsDog027C("Wolf", 40);
    doAnimalStuff(wolf, "Fast");
  }

  public static void doAnimalStuff(OOPsAnimal027B animal, String speed) {
    animal.move(speed);
    animal.makesNoise();
    System.out.println(animal);
  }
}
