package likeLion.practice.order;

import likeLion.practice.member.Member;

public interface OrderService {
    Order createOrder(Long id, String productName, int price);
}
