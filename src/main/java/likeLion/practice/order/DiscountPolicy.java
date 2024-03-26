package likeLion.practice.order;

import likeLion.practice.member.Member;

public interface DiscountPolicy {

    public int discount(Member member , int price);
}
