package likeLion.practice.order;

import likeLion.practice.member.Grade;
import likeLion.practice.member.Member;
import org.springframework.stereotype.Component;

@Component
public class FixDiscountPolicy implements DiscountPolicy{
    @Override
    public int discount(Member m, int price) {

        Grade g = m.getGrade();
        if (g == Grade.VIP) return price - 1000;
        else return price;
    }
}
