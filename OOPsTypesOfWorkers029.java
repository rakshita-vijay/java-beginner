import java.util.Scanner;

public class OOPsTypesOfWorkers029 {
  public static void main(String[] args) {
  }
}

class Worker029A {
  private String name;
  private String birthDate;
  private String endDate;

  Worker029A(String name, String birthDate, String endDate) {
    this.name = name;
    this.birthDate = birthDate;
    this.endDate = endDate;
  }

  public int getAge() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = scan.nextInt();
    return age;
  }

  public double collectPay() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number of years you have worked: ");
    double yearsWorked = scan.nextDouble();

    // if (yearsWorked <= 0) {
    //   return 0;
    // } else if (yearsWorked > 0 && yearsWorked <= 2) {
    //   return 1000;
    // } else if (yearsWorked > 2 && yearsWorked <= 5) {
    //   return 2000;
    // } else if (yearsWorked > 5 && yearsWorked <= 10) {
    //   return 3000;
    // } else {
    //   return 4000;
    // }

    return 4000;
  }

  public void terminate(String endDate) {
    this.endDate = endDate;
  }
}

class Employee029B extends Worker029A {
  private long employeeId;
  private String hireDate;

  Employee029B(String name, String birthDate, String endDate, long employeeId, String hireDate) {
    super(name, birthDate, endDate);

    this.employeeId = employeeId;
    this.hireDate = hireDate;
  }
}

class SalariedEmployee029C extends Employee029B {
  private double annualSalary;
  private boolean isRetired;

  SalariedEmployee029C(String name, String birthDate, String endDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
    super(name, birthDate, endDate, employeeId, hireDate);

    this.annualSalary = annualSalary;
    this.isRetired = isRetired;
  }

  public void retire() {}
}

class HourlyEmployee029D extends Employee029B {
  private double hourlyPayRate;

  HourlyEmployee029D(String name, String birthDate, String endDate, long employeeId, String hireDate, double hourlyPayRate) {
    super(name, birthDate, endDate, employeeId, hireDate);

    this.hourlyPayRate = hourlyPayRate;
  }

  public void getDoublePay() {}
}
