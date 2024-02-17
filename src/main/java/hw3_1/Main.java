package hw3_1;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = {new Book("Harry Potter"), new Magazine("Playboy")};
        for (Printable printable : printables) {
            printable.print();
        }
        Magazine.printMagazines(printables);
        Book.printBooks(printables);
    }
}