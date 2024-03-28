package likelion.practice.order;

public interface OrderService {
    Order createOrder(Long orderId, String productName, int orderPrice);
}
