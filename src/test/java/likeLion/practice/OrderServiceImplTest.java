package likeLion.practice;

import likeLion.practice.member.Member;
import likeLion.practice.member.Grade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
@SpringBootApplication
public class OrderServiceImplTest {

    @Autowired
    public OrderService orderService;

    @Autowired
    public DiscountPolicy discountPolicy;

    @Autowired
    public ApplicationContext ac;

    @Test
    public void discountTest(){
        Member member = new Member(1L, "memberA", Grade.VIP);
        orderService.join(member);
        Member findMember = orderService.findMember(1L);
        int price=10000;
        int result=orderService.discount(price,member);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
        System.out.println("price = " + result);
    }
}
