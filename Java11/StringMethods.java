// Java String methods
public class StringMethods {
  public static void main(String[] args) {
  	String post1 = "My studies have been going great and I'm really proud of myself.";
  	String post2 = "I can't wait to show my skills.";
  	// checking the length of a string
  	System.out.println(post1.length());
  	// join strings together
  	post1.concat(post2);
  	// check if the strings are equal
  	post1.equals(post2);
  	// check the location of a given string in reference to a string
  	post1.indexOf("reat");
  	// check for a single character
  	System.out.println(post1.charAt(0));
    System.out.println(post2.charAt(0));
    // get a specific range of characters in a string
    System.out.println(post1.substring(4, 11));
    // make a string lowercase or upercase
    System.out.println(post1.toLowerCase());
    System.out.println(post1.toUpperCase());
  }
}