package likeLion.pracitce.order;

import likeLion.pracitce.member.Grade;
import likeLion.pracitce.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{
    @Override
    public int discount(Member m, int price) {

        Grade g = m.getGrade();
        if (g == Grade.VIP) return price - 1000;
        else return price;
    }
}
