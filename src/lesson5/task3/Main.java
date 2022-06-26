package lesson5.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 2, new Driver("Stepan", 28, 9), 5000, 2004));
        cars.add(new Car("Renaul", 1.5, new Driver("Bogdan", 57, 30), 7000, 2014));
        cars.add(new Car("Mazda", 2, new Driver("Ivan", 19, 1), 3000, 2000));
        cars.add(new Car("Mersedes", 4.2, new Driver("Petro", 30, 4), 11000, 2009));
        cars.add(new Car("Nissan", 3, new Driver("Olya", 23, 6), 6600, 2007));
        cars.add(new Car("Audi", 2.2, new Driver("Inna", 25, 4), 5400, 2005));
        cars.add(new Car("Voskwagen", 1.9, new Driver("Vova", 27, 8), 4500, 2004));

        cars.stream()
                .skip(Math.round(cars.size() / 2))
                .forEach(car -> car.setPower(car.getPower() * 110));
        cars.stream()
                .map(car -> car.getDriver())
                .peek(driver -> {
                    if (driver.getAge() > 25 && driver.getExpAge() < 5) {
                        driver.setExpAge(driver.getExpAge() + 1);
                    }
                });
        cars.stream()
                .map(car -> car.getPrice())
                .reduce(0, ((accum, number) -> accum + number));
    }


}
