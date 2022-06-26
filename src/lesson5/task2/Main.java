package lesson5.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        ints.add(6);
        ints.add(7);
        ints.add(8);
        ints.add(9);
        ints.add(0);
        ints.add(1);
        ints.add(11);
        ints.add(10);
        ints.add(12);
        ints.add(13);
        ints.add(14);
        ints.add(15);
        ints.add(16);
        ints.add(17);
        ints.add(18);
        ints.add(19);
        ints.add(20);
        List<Integer> sortInts = ints.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortInts);
        sortInts.stream().filter(number -> number % 3 == 0);
        sortInts.stream().filter(number -> number % 10 == 0);
        sortInts.stream().forEach(System.out::println);
        sortInts.stream().map(integer -> integer * 3).collect(Collectors.toList())
    }
}
