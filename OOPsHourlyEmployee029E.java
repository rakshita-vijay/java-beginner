public class OOPsHourlyEmployee029E extends OOPsEmployee029C {
  private double hourlyPayRate;

  OOPsHourlyEmployee029E(String name, String birthDate, long employeeId, String hireDate, double hourlyPayRate) {
    super(name, birthDate, employeeId, hireDate);

    this.hourlyPayRate = hourlyPayRate;
  }

  public void getDoublePay() {}
}
