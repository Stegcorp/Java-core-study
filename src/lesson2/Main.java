package lesson2;

import lesson2.comp.PC;
import lesson2.comp.Ultrabook;
import lesson2.paper.Comics;
import lesson2.task4.Car;
import lesson2.task4.Gender;
import lesson2.task4.Skill;
import lesson2.user.Address;
import lesson2.user.Company;
import lesson2.user.User;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
//        User user = new User();
        User user1 = new User(1,"Leanne Graham","Bret","Sincere@april.biz",
                new Address("Kulas Light","Apt. 556","Gwenborough","92998-3874","81.1496","-37.3159"),
                "1-770-736-8031 x56442", "hildegard.org",
                new Company("Romaguera-Crona","Multi-layered client-server neural-net","harness real-time e-markets"));
//    System.out.println(user1);

        PC pc = new PC("1.4");
        Ultrabook ultrabook = new Ultrabook("1.3","13","5");
//        System.out.println(ultrabook);
        Comics comics = new Comics(10,"Super man", "DC");
//        System.out.println(comics);

        Car car = new Car("tesla",2020,430);
        lesson2.task4.User user = new lesson2.task4.User(1,"kokos","pupkin","kokosik@gmail.com",22, Gender.MALE,car);
        user.addSkills(new Skill("java",21));
    }


}
