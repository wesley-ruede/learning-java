public class Store {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    // altering the price attribute of the Store class
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // get price with tax method
  public double getPriceWithTax(){
    double tax = 0.08;
    double totalPrice = price + price*tax;
    return totalPrice;
  }
  
  public String toString(){
    // creating a string representation of an object in memory
    return "This store sells " +productType+ " at a price of " +price+".";
  }

  // main method
  public static void main(String[] args) {
    // instantiating an object
    Store lemonadeStand = new Store("Lemonade", 3.75);
    Store cookieShop = new Store("Cookie", 5);
    // getting a string representation of the objects
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
