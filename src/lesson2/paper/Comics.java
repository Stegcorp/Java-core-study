package lesson2.paper;

public class Comics extends Book{
    private String world;

    public Comics() {
    }

    public Comics(String world) {
        this.world = world;
    }

    public Comics(String title, String world) {
        super(title);
        this.world = world;
    }

    public Comics(int pages, String title, String world) {
        super(pages, title);
        this.world = world;
    }

    public String getWorld() {
        return world;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "world='" + world + '\'' +
                '}';
    }

    public void setWorld(String world) {
        this.world = world;
    }
}
