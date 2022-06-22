package lesson4.task3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        HashSet<User> users = new HashSet<>();
        ArrayList<Skill> skills = new ArrayList<>();
        skills.add(new Skill("java", 2));
        skills.add(new Skill("Angular", 3));
        users.add(new User(1, "pupka", "Tar tar", "sdads@gmail.com", 22, Gender.MALE, skills, new Car(2121, "tesla", 20000)));
        users.add(new User(2, "pupok", "Tar tar", "sdads@gmail.com", 22, Gender.FEMALE, skills, new Car(2121, "tesla", 20000)));
        users.add(new User(3, "papik", "Tar tar", "sdads@gmail.com", 22, Gender.FEMALE, skills, new Car(2121, "tesla", 20000)));
        users.add(new User(4, "dog", "Tar tar", "sdads@gmail.com", 22, Gender.MALE, skills, new Car(2121, "tesla", 20000)));
        users.add(new User(5, "fazan", "Tar tar", "sdads@gmail.com", 22, Gender.FEMALE, skills, new Car(2121, "tesla", 20000)));
        users.add(new User(6, "marko", "Tar tar", "sdads@gmail.com", 22, Gender.MALE, skills, new Car(2121, "tesla", 20000)));
        users.add(new User(7, "Ivan", "Tar tar", "sdads@gmail.com", 22, Gender.FEMALE, skills, new Car(2121, "tesla", 20000)));
        users.add(new User(8, "Osel", "Tar tar", "sdads@gmail.com", 22, Gender.MALE, skills, new Car(2121, "tesla", 20000)));
        users.add(new User(9, "BMW", "Tar tar", "sdads@gmail.com", 22, Gender.FEMALE, skills, new Car(2121, "tesla", 20000)));
        users.add(new User(10, "Zibert", "Tar tar", "sdads@gmail.com", 22, Gender.MALE, skills, new Car(2121, "tesla", 20000)));

        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User next = iterator.next();
            if (next.getGender().equals(Gender.FEMALE)) {
            iterator.remove();
            }
        }
        System.out.println(users);

        TreeSet<User> treeSet = new TreeSet<>(users);

    }
}
