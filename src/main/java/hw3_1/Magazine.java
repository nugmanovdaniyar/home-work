package hw3_1;

public class Magazine implements Printable {
    private final String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Magazine: " + title);
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable i : printable) {
            if (i instanceof Magazine) {
                i.print();
            }
        }
    }
}
