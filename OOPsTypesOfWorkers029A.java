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

    System.out.println();
    OOPsSalariedEmployee029D harry = new OOPsSalariedEmployee029D("Harry", "11/11/1995", "04/04/2020", 35000, false);
    System.out.println(harry);
    System.out.println("Harry's fortnightly paycheck is: $" + harry.collectPay());

    harry.retire();
    System.out.println("Harry's pension paycheck is: $" + harry.collectPay());

    System.out.println();
    OOPsHourlyEmployee029E mary = new OOPsHourlyEmployee029E("Mary", "11/11/2000", "05/05/2020", 15);
    System.out.println(mary);
    System.out.println("Mary's fortnightly paycheck is: $" + mary.collectPay());
    System.out.println("Mary's holiday paycheck is: $" + mary.getDoublePay());
  }
}
