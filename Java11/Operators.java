// The different Java operators in action
public class Operators {
	public static void main(String[] args) {
		double bill = 22;
		double tax = 0.55;
		double people = 5;
		double total = bill + bill * tax;
		double billSplit = total / 5;
		int candy = 21;
	  // giving each friend 4 pieces of candy how much will I have left
		int remainingCandy = candy % 4;
	  // a boolean operations which calculates whether the given values are equal or not equal
		boolean billVesusTotalA = bill == total;
		boolean billVesusTotalB = bill != total;
	  // a boolean operation to test if the given value is greater/less than or equal to
		int brownies = 10;
		int cakes = 13;
		boolean browniesOrCakes = brownies >= cakes;
		boolean cakesOrBrownies = cakes <= brownies;
	  // String concatenation
		int animals = 12;
		String species = "zebra";
		String zooDescription = "Our zoo has " +animals+ " " +species+"s!";
		System.out.println(zooDescription);
	}
}
