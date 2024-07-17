package likeLion.practice.order;

import likeLion.practice.member.Grade;
import likeLion.practice.member.Member;
import likeLion.practice.member.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class OrderServiceImplTest {
    @Autowired
    public OrderService orderService;

    @Autowired
    public MemberService memberService;

    @Test
    @Transactional
    void createOrder() {
        Member m1 = new Member(3L, "김정은", Grade.VIP);
        Member m2 = new Member(4L, "홍길동", Grade.BASIC);
        //sdf

        memberService.join(m1);
        memberService.join(m2);

        Order order1 = orderService.createOrder(m1.getId(), "빵" , 5000);
        Order order2 = orderService.createOrder(m2.getId(), "케이크" , 6000);

        System.out.println("order1 \n 할인전 가격 : " + order1.getPrice() +"\n 할인된 가격 : " + order1.getDiscountPrice());
        System.out.println("order2 \n 할인전 가격 : " + order2.getPrice() +"\n 할인된 가격 : " + order2.getDiscountPrice());
    }

}