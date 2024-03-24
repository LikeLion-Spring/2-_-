package likelion.practice.order;

import likelion.practice.member.Grade;
import likelion.practice.member.Member;
import likelion.practice.member.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderServiceImplTest {

    @Autowired
    private OrderService orderService;

    @Autowired
    private MemberService memberService;

    @Test
    void createOrder() {
        Member member1 = new Member(1L, "spring1", Grade.BASIC);
        Member member2 = new Member(2L, "spring2", Grade.VIP);

        memberService.join(member1);
        memberService.join(member2);

        Order basicOrder = orderService.createOrder(member1.getId(), "Apple", 100000);
        Order vipOrder = orderService.createOrder(member2.getId(), "Samsung", 100000);

        System.out.println(basicOrder.getDiscountedPrice());
        System.out.println(vipOrder.getDiscountedPrice());
    }
}