package lesson3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guitar implements Instrument {
    private int numberOfStrings;

    @Override
    public String play() {
     return "instrument"+" "+this.getClass().getSimpleName()+ " plays with next species" +" "+ this.toString();
    }
}
