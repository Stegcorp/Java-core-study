package lesson3.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(new Guitar(7));
        instruments.add(new Drum(12.4));
        instruments.add(new Trumpet(15));
        for (Instrument instrument : instruments) {
            System.out.println( instrument.play());
        }
    }
}
