package lesson3.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Magazine implements Printable{
    private String title;

    @Override
    public void print() {
        System.out.println("info about"+" "+this.getClass().getSimpleName() + " : " + this.toString());
    }
}
