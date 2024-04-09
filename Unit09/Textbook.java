package Unit09;

public class Textbook extends Book {
    private String subject;

    public Textbook(String theSubject) {
        super("");
        subject = theSubject;
    }

    public String toString() {
        return getBookTitle() + " has subject " + subject;
    }
}
