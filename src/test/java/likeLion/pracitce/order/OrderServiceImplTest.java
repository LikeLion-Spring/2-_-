package likeLion.pracitce.order;

import likeLion.pracitce.member.Grade;
import likeLion.pracitce.member.Member;
import likeLion.pracitce.member.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Map;

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
