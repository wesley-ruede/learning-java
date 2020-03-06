public class OOPandObjects{
	String duckFoot;
	int duckWings;
	int duckBeak;

	public OOPandObjects(String foot, int wings, int beak){
		duckFoot = foot;
		duckWings = wings;
		duckBeak = beak;
	}

	public OOPandObjects(){
	}

	private void changeDuckWings() {
		/*
		future method
		*/
	}

	public static void main(String[] args) {
		OOPandObjects Duck = new OOPandObjects("Ducks have two feet", 2, 1);
		System.out.println(Duck.duckFoot);
		boolean duckParts = Duck.duckWings >= Duck.duckBeak;
		System.out.println("It is " +duckParts+ " that ducks have more wings than beaks");
	}
}
