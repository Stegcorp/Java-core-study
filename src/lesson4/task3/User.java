package lesson4.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Comparable<User> {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private List<Skill> skills = new ArrayList<>();
    private Car car;

    @Override
    public int compareTo(User o) {
        return this.skills.size() - o.skills.size();
    }

}

