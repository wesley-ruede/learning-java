// simple calculator program that is oop
public class Calculator{
  // defining the calculator constructor
  public Calculator(){ 
  } 
  // defining arithmetic methods
  public int add(int a, int b){
    return a + b;
  }
  
  public int subtract(int a, int b){
    return a - b;
  }
  
  public int multiply(int a, int b){
    return a * b;
  }
  
  public int divide(int a, int b){
    return a / b;
  }
  
  public int modulo(int a, int b){
    return a % b;
  }
  // creating main function
  public static void main(String[] args){
    // instantiating a new object from the calculator class
    Calculator myCalculator = new Calculator();
    // printing out the values from calling the methods on the object
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));
  }
}
