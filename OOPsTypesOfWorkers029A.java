public class OOPsTypesOfWorkers029A {
  public static void main(String[] args) {
    OOPsWorker029B max = new OOPsWorker029B("Max", "01/02/2003");
    System.out.println(max);

    System.out.println();
    OOPsEmployee029C brit = new OOPsEmployee029C("Brit", "11/11/1980", 77001, "01/01/2020");
    System.out.println(brit);
    System.out.println("Age: " + brit.getAge());
    System.out.println("Pay: " + brit.collectPay());

    System.out.println();
    OOPsEmployee029C tim = new OOPsEmployee029C("Tim", "11/11/1985", "02/02/2020");
    System.out.println(tim);

    System.out.println();
    OOPsEmployee029C joe = new OOPsEmployee029C("Joe", "11/11/1990", "03/03/2020");
    System.out.println(joe);
  }
}
