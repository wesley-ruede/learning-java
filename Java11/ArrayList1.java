// creating and using a simple array list
import java.util.ArrayList;

public class ArrayList1{
	public static void main(String[] args){
        ArrayList<String> food = new ArrayList<String>();
	// adding values to the ArrayList
        food.add("cookies");
        food.add("brownies");
        food.add("french toast");
        System.out.println(food);
    // getting values from an ArrayList
        System.out.println(food.get(1));
    // changing an ArrayList's values
        food.set(2, "Babi ketjap");
        System.out.println(food);
        System.out.println("Laura loves " +food.get(2)+" and " +food.get(1));
    // removing a value
        food.remove(0);
	}
}
