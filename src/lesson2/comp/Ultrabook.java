package lesson2.comp;

public class Ultrabook extends Laptop {
    private String height;

    public Ultrabook() {
    }

    public Ultrabook(String processor, String wight, String height) {
        super(processor, wight);
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "height='" + height + '\'' +
                '}';
    }
}
