package lesson4.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(21,"Andriy"));
        users.add(new User(22,"Anna"));
        users.add(new User(23,"Olga"));
        users.add(new User(24,"Petro"));
        users.add(new User(26,"Vova"));

//        users.sort((o1, o2) -> o1.getAge()- o2.getAge());
        users.sort((o1, o2) -> o1.getName().length()- o2.getName().length());
//        users.sort((o1, o2) -> o2.getName().length()- o1.getName().length());
        System.out.println(users);
    }
}
