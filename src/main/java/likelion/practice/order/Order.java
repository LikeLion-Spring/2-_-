package likelion.practice.order;

public class Order {
    private Long id;
    private String name;
    private int price;
    private int discountedPrice;

    public Order(Long id, String name, int price, int discountedPrice) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountedPrice = discountedPrice;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getDiscountedPrice() {
        return discountedPrice;
    }
}
