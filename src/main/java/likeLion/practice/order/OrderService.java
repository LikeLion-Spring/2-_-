package likeLion.practice.order;

public interface OrderService {
    Order createOrder (long id, String productName, int price);
}
