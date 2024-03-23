package likeLion1.practice.order;

import likeLion1.practice.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
