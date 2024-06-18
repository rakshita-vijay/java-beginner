public class OOPsCustomerDetails025B {

  public OOPsCustomerDetails025B() {
    System.out.println("Empty constructor called");
  }
  private double accountNumber = 13579;
  private double accountBalance = 86420;
  private String customerName = "ABC";
  private String customerEmail = "ABC@gmail.com";
  private double customerPhoneNumber = 90817_26354.0;

  public double getAccountNumber() { return accountNumber; }
  public double getAccountBalance() { return accountBalance; }
  public String getCustomerName() { return customerName; }
  public String getCustomerEmail() { return customerEmail; }
  public double getCustomerPhoneNumber() { return customerPhoneNumber; }

  public void setAccountNumber(double accountNumber) { this.accountNumber = accountNumber; }
  public void setAccountBalance(double accountBalance) { this.accountBalance = accountBalance; }
  public void setCustomerName(String customerName) { this.customerName = customerName; }
  public void setCustomerEmail(String customerEmail) { this.customerEmail = customerEmail; }
  public void setCustomerPhoneNumber(double customerPhoneNumber) { this.customerPhoneNumber = customerPhoneNumber; }

  public void printAccountDetails() {
    System.out.println("Customer's Name: " + customerName);
    System.out.println("Customer's Email: " + customerEmail);
    System.out.println("Customer's Phone Number: " + customerPhoneNumber);
    System.out.println("Customer's Account Number: " + accountNumber);
    System.out.println("Customer's Account Balance: " + accountBalance);
  }

  public void depositFunds(double depositAmount) {
    setAccountBalance(accountBalance + depositAmount);
    // return accountBalance;
  }

  public void withdrawFunds(double withdrawalAmount) {
    if (accountBalance - withdrawalAmount < 0) {
      System.out.println("Not able to withdraw money as bank balance becomes negative. So, balance remains: " + accountBalance);
      // return accountBalance;
    } else {
      setAccountBalance(accountBalance - withdrawalAmount);
      // return accountBalance;
    }
  }
}
