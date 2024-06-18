public class OOPsBankAccount025A {
  public static void main(String[] args) {
    OOPsCustomerDetails025B customerDetails = new OOPsCustomerDetails025B();   // calling a constructor

    System.out.println("Customer Name: " + customerDetails.getCustomerName());
    System.out.println("Customer Email: " + customerDetails.getCustomerEmail());
    System.out.println("Customer Phone Number: " + customerDetails.getCustomerPhoneNumber());
    System.out.println("Customer Account Number: " + customerDetails.getAccountNumber());
    System.out.println("Customer Account Balance: " + customerDetails.getAccountBalance());

    customerDetails.setCustomerName("XYZ");
    customerDetails.setCustomerEmail("XYZ@gmail.com");
    customerDetails.setCustomerPhoneNumber(90817_26354.0);
    customerDetails.setAccountNumber(97531);
    customerDetails.setAccountBalance(246810.0);

    System.out.println();
    customerDetails.printAccountDetails();

    System.out.println();

    customerDetails.depositFunds(100_000);
    customerDetails.printAccountDetails();
    System.out.println();
    customerDetails.withdrawFunds(300_000);
    customerDetails.printAccountDetails();

    // trying to withdraw more than what's available
    System.out.println();
    customerDetails.withdrawFunds(300_000_000);
    customerDetails.printAccountDetails();
  }
}
