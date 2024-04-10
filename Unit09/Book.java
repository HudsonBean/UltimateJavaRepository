package Unit09;

public class Book {
    public String bookTitle;
    private static int a;

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
