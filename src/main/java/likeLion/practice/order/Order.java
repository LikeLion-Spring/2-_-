package likeLion.practice.order;

public class Order {
    private long id;
    private String productName;
    private int price;

    public Order(long id, String productName, int price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }
    public int getPrice() {
        return price;
    }
}
