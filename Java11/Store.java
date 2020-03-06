public class Store {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  public double getPriceWithTax(){
    double tax = 0.08;
    double totalPrice = price + price*tax;
    return totalPrice;
  }
  
  public String toString(){
    // String representation of the Store class
    return "This store sells " +productType+ " at a price of " +price+".";
  }

  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    Store cookieShop = new Store("Cookie", 5);
    /* Use case */
    System.out.println(lemonadeStand);
    System.out.println(cookieShop);
    // calling the increasePrice method on the lemonadeStand object
    lemonadeStand.increasePrice(1.5);
    System.out.println("The new price of " +lemonadeStand.productType+ " is " +lemonadeStand.price+ ".");
    // calling getPriceWithTax method on the cookieShop object
    cookieShop.getPriceWithTax();
    System.out.println("A " +cookieShop.productType+ " with tax is " +cookieShop.getPriceWithTax()+ ".");
  }
}
