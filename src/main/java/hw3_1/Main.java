package hw3_1;

public class Main {
    public static void main(String[] args) {
        Printable[] printableArr = {new Book("Harry Potter"), new Magazine("Playboy")};
        for (Printable printable : printableArr) {
            printable.print();
        }
        Magazine.printMagazines(printableArr);
        Book.printBooks(printableArr);
    }
}
