package likeLion.practice.order;

public interface OrderService {
    Order createOrder(Long id, String productName, int price);

}