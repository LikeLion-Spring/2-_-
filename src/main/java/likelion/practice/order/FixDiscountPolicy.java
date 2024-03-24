package likelion.practice.order;

import likelion.practice.member.Grade;
import likelion.practice.member.Member;
import org.springframework.stereotype.Component;

@Component
public class FixDiscountPolicy implements DiscountPolicy {

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP)
            return price - 1000;
        else
            return price;
    }
}
