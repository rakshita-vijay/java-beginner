public class OOPsEmployee029C extends OOPsWorker029B {
  private long employeeId;
  protected String hireDate;

  private static int employeeNo = 1;

  OOPsEmployee029C(String name, String birthDate, String hireDate) {
    super(name, birthDate);

    this.employeeId = OOPsEmployee029C.employeeNo++;
    this.hireDate = hireDate;
  }

  OOPsEmployee029C(String name, String birthDate, long employeeId, String hireDate) {
    super(name, birthDate);

    this.employeeId = employeeId;
    this.hireDate = hireDate;
  }

  public String toString() {
    return "Employee { Employee Id = " + employeeId + ", Hire Date = " + hireDate + " } " + super.toString();
  }
}
