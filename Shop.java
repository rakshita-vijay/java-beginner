import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;

public class Shop {
  public static float returnCostToPayAfterDiscount(float cost) {
    return (cost >= 2500) ? (cost - ((10 * cost) / 100)) : cost;
  }

  public static float returnCostToPayAfterDiscount(float discountPercentage, float cost) {
    return (cost - ((discountPercentage * cost) / 100));
  }

  public static float returnSundayCost(float cost, int stdType, int premiumType) {
    if ((cost >= 3500) && (stdType == 0) && (premiumType > 0)) {
      return returnCostToPayAfterDiscount(16, cost);
    } else if ((cost >= 2500) && (stdType > 0) && (premiumType > 0)) {
      return returnCostToPayAfterDiscount(14, cost);
    } else if ((cost >= 1500) && (stdType > 0) && (premiumType == 0)) {
      return returnCostToPayAfterDiscount(12, cost);
    }
    return returnCostToPayAfterDiscount(cost);
  }

  public static void main(String args[]) {
    Package teddy = new Package("Standard", "Teddy Bear", 600);
    Package choco = new Package("Standard", "Chocolates", 1000);
    Package novel = new Package("Standard", "Novel", 800);

    Package photoFrame = new Package("Premium", "Photo Frame", 1500);
    Package ornaments = new Package("Premium", "Ornaments", 2000);
    Package caricature = new Package("Premium", "Personalized Caricature", 1800);

    ArrayList<Package> allPackagesInShop = new ArrayList<Package>();

    allPackagesInShop.add(teddy);
    allPackagesInShop.add(choco);
    allPackagesInShop.add(novel);

    allPackagesInShop.add(photoFrame);
    allPackagesInShop.add(ornaments);
    allPackagesInShop.add(caricature);

    Scanner scan = new Scanner(System.in);

    int numOfPackages;
    System.out.print("Enter number of Packages: ");
    numOfPackages = scan.nextInt();
    System.out.println();

    String packages;
    String[] packageNames = new String[numOfPackages];
    System.out.print("Enter package names: ");
    packages = scan.nextLine();
    packages = scan.nextLine();
    packageNames = packages.split(", ");

    System.out.println();

    // System.out.println("numOfPackages: " + numOfPackages);
    // System.out.println("packageNames length: " + packageNames.length);
    // System.out.println("allPackagesInShop size: " + allPackagesInShop.size());

    float finalCostWithoutTax = 0;
    float finalCostWithTax = 0;
    int stdType = 0;
    int premiumType = 0;

    for (int outerIndex = 0; outerIndex < numOfPackages; outerIndex++) {
      for (int innerIndex = 0; innerIndex < allPackagesInShop.size(); innerIndex++) {
        if ((packageNames[outerIndex]).equalsIgnoreCase((allPackagesInShop.get(innerIndex)).getName())) {
          finalCostWithoutTax += (allPackagesInShop.get(innerIndex)).getPrice();
          finalCostWithTax += (allPackagesInShop.get(innerIndex)).returnCostToPay();

          if ((allPackagesInShop.get(innerIndex)).getType() == "Standard") {
            stdType++;
          } else {
            premiumType++;
          }
        }
      }
    }

    float tax = finalCostWithTax - finalCostWithoutTax;

    System.out.println("finalCostWithoutTax: " + finalCostWithoutTax);
    System.out.println("finalCostWithTax: " + finalCostWithTax);
    // System.out.println("thus, tax: " + tax);

    System.out.println();

    System.out.print("Enter the day: ");
    String daye = scan.nextLine();

    if ((daye.equalsIgnoreCase("Sunday")) == false) {
      float discount = finalCostWithoutTax - returnCostToPayAfterDiscount(finalCostWithoutTax);
      float costAfterDiscount = finalCostWithTax - discount;

      System.out.println("costAfterDiscount: " + costAfterDiscount);
      System.out.println("thus, discount: " + discount);
    } else {
      float discount = finalCostWithoutTax - returnSundayCost(finalCostWithoutTax, stdType, premiumType);
      float sundayCost = finalCostWithTax - discount;

      System.out.println("sundayCost: " + sundayCost);
      System.out.println("thus, discount: " + discount);
    }

    scan.close();
  }
}
