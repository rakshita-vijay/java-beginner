public class OOPsOverloadedConstructors026A {
  public static void main(String[] args) {
    OOPsCustomer026B customer = new OOPsCustomer026B();

    customer.printDetails();

    System.out.println();

    System.out.println("Name: " + customer.getName());
    System.out.println("Credit Limit: " + customer.getCreditLimit());
    System.out.println("Email Address: " + customer.getEmailAddress());

    customer = new OOPsCustomer026B("XYZ", 67890, "XYZ@gmail.com");
    System.out.println();
    customer.printDetails();

    customer = new OOPsCustomer026B("PQR", 24680, "PQR@gmail.com");
    System.out.println();
    customer.printDetails();

    customer = new OOPsCustomer026B("LMN", "LMN@gmail.com");
    System.out.println();
    customer.printDetails();
  }
}
