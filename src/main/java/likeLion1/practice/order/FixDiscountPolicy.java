package likeLion1.practice.order;

import likeLion1.practice.member.Grade;
import likeLion1.practice.member.Member;
import org.springframework.stereotype.Component;


@Component
public class FixDiscountPolicy implements DiscountPolicy{

    @Override
    public int discount(Member m, int price) {
        Grade g = m.getGrade();

        if(g == Grade.VIP)
            return price - 1000;
        else
            return price;
    }

}
