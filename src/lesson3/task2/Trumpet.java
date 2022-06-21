package lesson3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trumpet implements Instrument{
    private int diameter;

    @Override
    public String  play() {
        return "instrument"+" "+this.getClass().getSimpleName()+ " plays with next species"+" "+ this.toString();
    }
}
