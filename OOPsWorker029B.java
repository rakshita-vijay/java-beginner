public class OOPsWorker029B {
  private String name;
  private String birthDate;
  protected String endDate;

  public OOPsWorker029B() {}

  public OOPsWorker029B(String name, String birthDate) {
    this.name = name;
    this.birthDate = birthDate;
  }

  public int getAge() {
    int currentYear = 2024;
    int birthYear = Integer.parseInt(birthDate.substring(6));   // assuming the form dd/mm/yyyy
    return (currentYear - birthYear);
  }

  public double collectPay() {
    return 0.0;
  }

  public void terminate(String endDate) {
    this.endDate = endDate;
  }

  public String toString() {
    return "Worker { Name = " + name + ", Age = " + getAge() + ", Birth Date = " + birthDate + ", Pay = " + collectPay() + ", End Date = " + endDate + " } ";
  }
}
