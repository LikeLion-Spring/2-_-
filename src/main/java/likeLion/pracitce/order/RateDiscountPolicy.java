package likeLion.pracitce.order;

import likeLion.pracitce.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{
    @Override
    public int discount(Member m, int price) {
        return 0;
    }
}
