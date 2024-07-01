public class OOPsHourlyEmployee029E extends OOPsEmployee029C {
  private double hourlyPayRate;

  OOPsHourlyEmployee029E(String name, String birthDate, String hireDate, double hourlyPayRate) {
    super(name, birthDate, hireDate);

    this.hourlyPayRate = hourlyPayRate;
  }

  @Override
  public double collectPay() {
    return (40 * hourlyPayRate);
  }

  public double getDoublePay() { return (2 * collectPay()); }
}
