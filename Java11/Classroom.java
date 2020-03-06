import java.util.Arrays;

public class Classroom {
  
  public static void main(String[] args){
    // creating and assigning values to a string array
    String[] students = {"Sade", "Alexus", "Sam", "Koma"};
    // creating a new empty array
    double[] mathScores = new double[4];
    // setting values in respect to the students 
    mathScores[0] = 94.5;
    // Sam
    mathScores[2] = 76.8;
    // getting the length of students and printing it
    System.out.println("The number of students in the class is " + students.length);
  }
}
