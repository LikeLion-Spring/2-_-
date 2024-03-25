package likeLion.practice.order;

import likeLion.practice.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{
    @Override
    public int discount(Member m, int price) {
        return 0;
    }
}
