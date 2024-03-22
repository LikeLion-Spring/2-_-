package likeLion.practice.order;

import likeLion.practice.member.Member;
import org.springframework.stereotype.Component;

@Component
public class FixDiscountPolicy implements DiscountPolicy {
    @Override
    public int discount(Member m, int price) {
        Member.Grade a=m.getGrade();
        if (a== Member.Grade.VIP){
            return price-1000;
        }return price;
    }
}
