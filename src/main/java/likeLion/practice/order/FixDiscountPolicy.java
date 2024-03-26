package likeLion.practice.order;

import likeLion.practice.member.Grade;
import likeLion.practice.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    public int discount(Member member, int price) {

        if (member.getGrade() == Grade.VIP)
            return price-1000;
        else
            return price;
    }
}
