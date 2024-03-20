package likeLion1.practice.order;

import likeLion1.practice.member.Grade;
import likeLion1.practice.member.Member;
import likeLion1.practice.member.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class OrderServiceImplTest {

    @Autowired
    private OrderService os;

    @Autowired
    private MemberService ms;

    @Test
    void createOrder() {
        //회원 생성
        Member m1 = new Member(1L, "강찬욱", Grade.VIP);
        Member m2 = new Member(2L, "곽민재", Grade.BASIC);
        //회원 가입
        ms.join(m1);
        ms.join(m2);

        Order vipOrder = os.createOrder(m1.getId(), "아이폰", 3000);
        Order basicOrder = os.createOrder(m2.getId(), "아이폰", 3000);

        System.out.println("-------------------------");
        System.out.println(vipOrder.getDiscountPrice());
        System.out.println(basicOrder.getDiscountPrice());
        System.out.println("-------------------------");

    }
}