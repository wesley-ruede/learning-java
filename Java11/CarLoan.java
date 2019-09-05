// a car loan calculator
public class CarLoan {
	public static void main(String[] args) {
    int carLoan = 10000;
    // 3 years
    int loanLength = 3;
    // 5% on the loan
    int interestRate = 5;
    int downPayment = 2000;
    // requirement to make sure the loan is valid
    if (loanLength <= 0 || interestRate <= 0) {
      System.out.println("Error! You must take out a valid car loan.");
    } else if (downPayment >= carLoan) {
      System.out.println("The car can be paid in full");
    } else {
      int remainingBalance = carLoan - downPayment;
      // converting 3 year loan to a monthly payment
      int months = loanLength * 12;
      // monthly payment without interest
      int monthlyBalance = remainingBalance / months;
      // calculate the amount of interest to pay per month
      int interest = (monthlyBalance * interestRate) / 100;
      // calculate the final monthly payment
      int monthlyPayment = monthlyBalance + interest;
      System.out.println(monthlyPayment);
    }
  }
}
