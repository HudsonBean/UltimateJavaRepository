package Unit09;

public class Textbook extends Book {
    private String subject;

    public Textbook(String theSubject) {
        super(5);
        subject = theSubject;

    }

    public String toString() {
        return getBookTitle() + " has subject " + subject;
    }

    public int getA() {
        System.out.println(super.getA());
        return super.getA();
    }

}
