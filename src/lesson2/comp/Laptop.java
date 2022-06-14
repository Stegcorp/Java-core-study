package lesson2.comp;

public class Laptop extends PC {
    private String wight;

    public Laptop() {
    }

    public Laptop(String processor, String wight) {
        super(processor);
        this.wight = wight;
    }

    public String getWight() {
        return wight;
    }

    public void setWight(String wight) {
        this.wight = wight;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "wight='" + wight + '\'' +
                '}';
    }
}
