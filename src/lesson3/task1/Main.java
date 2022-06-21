package lesson3.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(new Book(500));
        printables.add(new Magazine("DC"));
        for (Printable printable : printables) {
                printable.print();
        }
    }
}
