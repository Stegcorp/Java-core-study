package lesson3.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Printable {
    public int pages;
    @Override
    public void print() {
        System.out.println("info about"+" "+this.getClass().getSimpleName() + " : " + this.toString());
    }
}
