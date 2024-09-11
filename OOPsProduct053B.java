public class OOPsProduct053B {
  public String name;
  public String description;
  public int unitPrice;
  public int quantity;
  public double finalPrice;

  public OOPsProduct053B(String name, int quantity) { // used by buyer
    this.name = name;
    this.quantity = quantity;
    this.finalPrice = calculateFinalPrice(name, quantity);
  }

  public OOPsProduct053B(String name, String description, int unitPrice) { // used by shopkeeper
    this.name = name;
    this.description = description;
    this.unitPrice = unitPrice;
  }

  public double calculateFinalPrice(String name, int quantity) {
    return unitPrice * quantity;
  }

  public void displayProductOnSaleDetails() {
    System.out.println("Name: " + name + "\nDescription: " + description + "\nUnit Price: " + unitPrice + "\nQuantity: " + quantity + "\n");
  }

  public void displayProductsBoughtDetails() {
    System.out.println("Name: " + name + "\nDescription: " + description + "\nQuantity: " + quantity + "\n" + "\nFinal Price: " + finalPrice);
  }
}
