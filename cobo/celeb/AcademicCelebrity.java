public class AcademicCelebrity extends Celebrity {
	public LiteratureCelebrity(String answer, String field, String clue) {
    super(answer, makeClue(field, clue));
  }

  public String makeClue(String field, String clue) {
    return "This academic is in the field of " + field + ". They are associated with " + clue;
  }

  public String setClue(String field, String clue) {
    return super.setClue(makeClue(field, clue));
  }

  public String toString() {
    return "The celebrity is... " + _answer + ". " + _clue;
  }
}
