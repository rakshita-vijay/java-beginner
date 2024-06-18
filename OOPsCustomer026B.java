public class OOPsCustomer026B {
  private String name = "ABC";
  private double creditLimit = 12345;
  private String emailAddress = "ABC@gmail.com";

  public String getName() { return name; }
  public double getCreditLimit() { return creditLimit; }
  public String getEmailAddress() { return emailAddress; }

  public OOPsCustomer026B() {
    // this("TUV", "TUV@gmail.com");
  }

  public OOPsCustomer026B(String name, String emailAddress) {
    this(name, 13579, emailAddress);
  }

  public OOPsCustomer026B(String name, double creditLimit, String emailAddress) {
    this.name = name;
    this.creditLimit = creditLimit;
    this.emailAddress = emailAddress;
  }

  public void printDetails() {
    System.out.println("Name: " + name);
    System.out.println("Credit Limit: " + creditLimit);
    System.out.println("Email Address: " + emailAddress);
  }
}
