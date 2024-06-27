public class OOPsHourlyEmployee029E extends OOPsEmployee029C {
  private double hourlyPayRate;

  OOPsHourlyEmployee029E(String name, String birthDate, String endDate, long employeeId, String hireDate, double hourlyPayRate) {
    super(name, birthDate, endDate, employeeId, hireDate);

    this.hourlyPayRate = hourlyPayRate;
  }

  public void getDoublePay() {}
}
