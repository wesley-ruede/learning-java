class SinoTibetan extends Language {
  // reducing requirements for the constructor
  SinoTibetan(String languageName, int speakers) {
    // using super to create a sub-class based on the constructor inherited from the Language class
    super(languageName, speakers, "Asia", "subject-object-verb");
  }
}
