package likelion.practice.order;

public class Order {
    private Long orderId;
    private String productName;
    private int orderPrice;
    private int discountAmount;

    public Order(Long orderId, String productName, int orderPrice, int discountAmount) {
        this.orderId = orderId;
        this.productName = productName;
        this.orderPrice = orderPrice;
        this.discountAmount = discountAmount;
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getProductName() {
        return productName;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public int getDiscountAmount() {
        return discountAmount;
    }
}

