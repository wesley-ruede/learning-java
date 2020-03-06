public class Language {
  protected String name;
  protected int numSpeakers;
  protected String regionSpoken;
  protected String wordOrder;

  public Language(String langName, int speakers, String region, String order) {
    this.name = langName;
    this.numSpeakers = speakers;
    this.regionSpoken = region;
    this.wordOrder = order;
  }
  
  public void getInfo() {
    System.out.println(this.name + " is spoken by " +this.numSpeakers+ " people mainly in " +this.regionSpoken+ ". The language follows the word order: " +this.wordOrder);
  }
  
  public static void main(String[] args) {
    Language english = new Language("English", 1000000000, "world wide", "Subject + Verb + Object");
    SinoTibetan transHimalayan = new SinoTibetan("Chinese", 1200000000);
    Mayan protoMayan = new Mayan("Ch'olan", 25000000);

    /* Use Case */
    english.getInfo();
    protoMayan.getInfo();
    transHimalayan.getInfo();
  } 
}
