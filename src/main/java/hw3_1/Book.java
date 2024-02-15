package hw3_1;

public class Book implements Printable {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Book: " + title);
    }

    public static void printBooks(Printable[] printable) {
        for (Printable i : printable) {
            if (i instanceof Book) {
                i.print();
            }
        }
    }
}
