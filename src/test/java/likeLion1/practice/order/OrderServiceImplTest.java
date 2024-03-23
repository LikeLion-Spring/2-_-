package likeLion1.practice.order;

import likeLion1.practice.member.Grade;
import likeLion1.practice.member.Member;
import likeLion1.practice.member.MemberService;
import likeLion1.practice.order.Order;
import likeLion1.practice.order.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderServiceImplTest {
    @Autowired
    public OrderService orderService;

    @Autowired
    public MemberService memberService;

    @Test
    void createOrder() {
        Member m1 = new Member(3L, "김정은", Grade.VIP);
        Member m2 = new Member(4L, "홍길동", Grade.BASIC);

        memberService.join(m1);
        memberService.join(m2);

        Order order1 = orderService.createOrder(m1.getId(), "빵" , 5000);
        Order order2 = orderService.createOrder(m2.getId(), "케이크" , 6000);

        System.out.println("order1 \n 할인전 가격 : " + order1.getPrice() +"\n 할인된 가격 : " + order1.getDiscountPrice());
        System.out.println("order2 \n 할인전 가격 : " + order2.getPrice() +"\n 할인된 가격 : " + order2.getDiscountPrice());
    }

}