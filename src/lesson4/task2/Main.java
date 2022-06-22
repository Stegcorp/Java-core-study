package lesson4.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Brr"));
        users.add(new User("Frr"));
        users.add(new User("Qrr"));
        users.add(new User("Arr"));
        users.add(new User("Drr"));
        users.add(new User("Rrr"));
        users.add(new User("Trr"));
        users.add(new User("Yrr"));
        users.add(new User("Srr"));
        users.add(new User("Urr"));
        users.add(new User("Crr"));
        users.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(users);
    }
}
