package lesson5.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("dog");
        strings.add("every");
        strings.add("interesting");
        strings.add("night");
        strings.add("day");
        strings.add("Sunday");
        strings.add("moon");
        strings.add("stars");
        strings.add("super");
        strings.add("megane");
        strings.add("e46");
        strings.add("BMW");
        strings.add("lesson");
        strings.add("samsung");
        strings.add("apple");


        List<String> collect = strings.stream()
                .map(String::toLowerCase)
                .sorted(String::compareTo)
                .collect(Collectors.toList());
//        collect.stream().forEach(System.out::println);
        List<String> minfour = collect.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
        System.out.println(minfour);
    }
}
