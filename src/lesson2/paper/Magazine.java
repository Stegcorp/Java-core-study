package lesson2.paper;

public class Magazine extends Book{
    private String shop;

    public Magazine() {
    }

    public Magazine(String shop) {
        this.shop = shop;
    }

    public Magazine(String title, String shop) {
        super(title);
        this.shop = shop;
    }

    public Magazine(int pages, String title, String shop) {
        super(pages, title);
        this.shop = shop;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "shop='" + shop + '\'' +
                '}';
    }
}
