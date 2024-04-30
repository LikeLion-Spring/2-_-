package likeLion.practice.order;

public class Order {

    Long id;
    String productName;
    int price;

    int discountPrice;

    public Order(Long id, String productName, int price, int discountPrice) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.discountPrice = discountPrice;
    }

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }
}