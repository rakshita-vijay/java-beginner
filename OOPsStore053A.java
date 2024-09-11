import java.util.ArrayList;
import java.util.Scanner;

public class OOPsStore053A {

  public double sellItems(ArrayList<OOPsProduct053B> listOfOrderItems) {
    return 0.0;
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<OOPsProduct053B> listOfProductsForSale = new ArrayList<>();
    ArrayList<OOPsProduct053B> listOfOrderItems = new ArrayList<>();

    listOfProductsForSale.add

    boolean choice = true;

    while (choice) {
      System.out.println("Enter the product you want: ");
      String name = scan.nextLine();
      System.out.println("Enter the quantity you want: ");
      int quantity = scan.nextInt();

      listOfOrderItems.add(new OOPsProduct053B(name, quantity));
    }
  }
}
