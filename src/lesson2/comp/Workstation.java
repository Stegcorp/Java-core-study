package lesson2.comp;

import lombok.*;



public class Workstation extends Laptop{
    private String power;

    public Workstation() {
    }

    public Workstation(String processor, String wight, String power) {
        super(processor, wight);
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "power='" + power + '\'' +
                '}';
    }
}
