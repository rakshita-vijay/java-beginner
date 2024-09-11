import java.util.ArrayList;

public class OOPsAbstractClassInheritance052A {
  public static void main(String[] args) {
    // OOPsAbstractClassAnimal052B animal = new OOPsAbstractClassAnimal052B("animal", "big", 100);   // doesn't work
    OOPsDog052C dog1 = new OOPsDog052C("animal", "big", 100);
    OOPsDog052C dog2 = new OOPsDog052C("wolf", "big", 100);

    dog1.makeNoise();
    dog2.makeNoise();

    System.out.println();

    doAnimalStuff(dog1, "slowly");
    doAnimalStuff(dog2, "fast");

    System.out.println();

    ArrayList<OOPsAbstractClassAnimal052B> animals = new ArrayList<>();
    animals.add(dog1);
    animals.add(dog2);
    animals.add(new OOPsDog052C("German Shepherd", "big", 150));
    animals.add(new OOPsFish052D("Goldfish", "small", 1));
    animals.add(new OOPsFish052D("Barracuda", "big", 75));
    animals.add(new OOPsDog052C("Pug", "small", 20));

    animals.add(new OOPsHorse052F("Clydesdale", "large", 1000));

    animals.add(new OOPsDog052G("Husky", "big", 100));
    animals.add(new OOPsDog052G("Pariah", "small", 75));

    for (OOPsAbstractClassAnimal052B animal : animals){
      doAnimalStuff(animal, "slow");
      if(animal instanceof OOPsAbstractClassMammal052E currentMammal) {
        currentMammal.shedHair();
      }
    }
  }

  private static void doAnimalStuff (OOPsAbstractClassAnimal052B animal, String speed) {
    animal.makeNoise();
    animal.move(speed);
  }
}
