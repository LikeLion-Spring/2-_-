package likelion.practice.order;

public interface OrderService {
    Order createOrder(Long id, String name, int price);
}
