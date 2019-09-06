public class Language {
  // creating protected instance fields
  protected String name;
  protected int numSpeakers;
  protected String regionSpoken;
  protected String wordOrder;
  // setting parameters for the constructor
  public Language(String langName, int speakers, String region, String order) {
    // initalizing the fields
    this.name = langName;
    this.numSpeakers = speakers;
    this.regionSpoken = region;
    this.wordOrder = order;
  }
  
  // creating a new method
  public void getInfo() {
    System.out.println(this.name + " is spoken by " +this.numSpeakers+ " people mainly in " +this.regionSpoken+ ". The language follows the word order: " +this.wordOrder);
  }
  
  public static void main(String[] args) {
    // instantiating an object of Language
    Language english = new Language("English", 1000000000, "world wide", "Subject + Verb + Object");
    // testing the getInfo method
    english.getInfo();
    // instantiating an object of the Mayan class
    Mayan protoMayan = new Mayan("Ch'olan", 25000000);
    protoMayan.getInfo();
    // instantiating an object of the SinoTibeten class
    SinoTibetan transHimalayan = new SinoTibetan("Chinese", 1200000000);
    transHimalayan.getInfo();
  } 
}
