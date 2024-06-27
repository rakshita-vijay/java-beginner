public class OOPsTypesOfWorkers029A {
  public static void main(String[] args) {
    OOPsWorker029B max = new OOPsWorker029B("Max", "01/02/2003");
    System.out.println(max);

    System.out.println();
    OOPsEmployee029C tim = new OOPsEmployee029C("Tim", "11/11/1985", 77001, "01/01/2020");
    System.out.println(tim);
    System.out.println("Age: " + tim.getAge());
    System.out.println("Pay: " + tim.collectPay());
  }
}
