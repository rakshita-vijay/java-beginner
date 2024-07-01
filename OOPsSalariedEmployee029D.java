public class OOPsSalariedEmployee029D extends OOPsEmployee029C {
  private double annualSalary;
  private boolean isRetired;

  OOPsSalariedEmployee029D(String name, String birthDate, String hireDate, double annualSalary, boolean isRetired) {
    super(name, birthDate, hireDate);

    this.annualSalary = annualSalary;
    this.isRetired = isRetired;
  }

  @Override
  public double collectPay() {
    double paycheck = (annualSalary / 26);
    return ((isRetired) ? (paycheck * 0.9) : paycheck);
  }

  public void retire() {
    // terminate(Integer.toString(Integer.parseInt(this.hireDate.substring(0, 1)) + 1) + "/"
    //           + Integer.toString(Integer.parseInt(this.hireDate.substring(3, 4)) + 1) + "/"
    //           + Integer.toString(Integer.parseInt(this.hireDate.substring(6)) + 5));
    terminate("12/12/2025");
    isRetired = true;
  }

  public String toString() {
    return "Salaried Employee { Annual Salary = " + annualSalary + ", Retirement status = " + isRetired + " } " + super.toString();
  }
}
