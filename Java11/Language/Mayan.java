class Mayan extends Language {

  Mayan(String languageName, int speakers) {
    // using super to create a sub-class based on the constructor inherited from the Language class
    super(languageName, speakers, "Central America", "verb-object-subject");
  }
}
