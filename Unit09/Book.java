package Unit09;

public class Book {
    public String bookTitle;
    private static int a;

    public Book() {
        bookTitle = "uninitialized";
    }

    public Book(int x) {
        this.bookTitle = "";
        a = x;
    }

    public Book(String title) {
        bookTitle = title;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String printOut() {
        return "Hello World";
    }

    public int getA() {
        return a;
    }
}

class Textbook extends Book {
    private String subject = "default";

    public String getSubject() {
        return subject;
    }
}

class PictureBook extends Book {

}

class BookRunner {
    public static void main(String[] args) {
        Book[] books = { new Book(), new Textbook(), new PictureBook() };

        if (books[0] instanceof Textbook) {
            ((Textbook) books[0]).getSubject();
        }
    }
}
