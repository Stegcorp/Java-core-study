package lesson5.task3;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    public String model;
    public double power;
    public Driver driver;
    public int price;
    public int year;

}
