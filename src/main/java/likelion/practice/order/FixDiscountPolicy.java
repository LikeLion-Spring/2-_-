package likelion.practice.order;

import likelion.practice.member.Member;
import org.springframework.stereotype.Component;

import static likelion.practice.member.Grade.VIP;

@Component
public class FixDiscountPolicy implements DiscountPolicy {

    @Override
    public int discount(Member m, int orderPrice) {
        if (m.getGrade() == VIP) {
            return orderPrice - 1000;
        }
        else {
            return orderPrice;
        }
    }

}
