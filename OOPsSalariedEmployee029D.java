public class OOPsSalariedEmployee029D extends OOPsEmployee029C {
  private double annualSalary;
  private boolean isRetired;

  OOPsSalariedEmployee029D(String name, String birthDate, String endDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
    super(name, birthDate, endDate, employeeId, hireDate);

    this.annualSalary = annualSalary;
    this.isRetired = isRetired;
  }

  public void retire() {}
}
