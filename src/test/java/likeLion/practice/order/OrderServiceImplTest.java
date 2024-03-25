package likeLion.practice.order;

import likeLion.practice.member.Grade;
import likeLion.practice.member.Member;
import likeLion.practice.member.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderServiceImplTest {

    @Autowired
    public OrderService orderService;

    @Autowired
    public MemberService memberService;

    @Test
    public void autowiredTest() {

        Member m1 = new Member(1L, "m1", Grade.VIP);
        Member m2 = new Member(2L, "m2", Grade.BASIC);

        memberService.join(m1);
        memberService.join(m2);

        Order vipOrder = orderService.createOrder(m1.getId(), "아이폰", 3000);
        Order basicOrder = orderService.createOrder(m2.getId(), "아이폰", 3000);

        System.out.println(vipOrder.getPrice());
        System.out.println(basicOrder.getPrice());
    }
}
