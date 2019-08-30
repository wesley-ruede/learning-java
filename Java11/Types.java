// There are quite a few different Java types that
public class Types {
  public static void main(String[] args) {
	  char grade = 'A'; // this is single character and uses single quotes
	  int number1 = 285; // integers do not have fractional part
	  double number2 = 4.94; // a fractional number
	  String codeFeels = "I love coding"; // a String is a class that is a sequence of char's
	  boolean True = true; // a primitive representation of the truth values true and false
	  // Note that Java is statically typed and assigning the wrong variable type will cause an error
	  // Note you cannot assign a number as the first charcter of a variable e.g., int 1st = 1;
	  // Note you cannot assign a period (.) in a variable at all
	  // finally camelCase is the standard practice with Java as it is with Python firstName
	  System.out.println("This is a char variable");
	  System.out.println(grade);
	  System.out.println("This is an integer variable");
	  System.out.println( number1);
	  System.out.println("This is a double variable");
	  System.out.println(number2);
	  System.out.println("This is a String variable");
	  System.out.println(codeFeels);
	  System.out.println("This is a boolean variable");
	  System.out.println(True);
  }
}
