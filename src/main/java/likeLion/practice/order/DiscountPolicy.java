package likeLion.practice.order;

import likeLion.practice.member.Member;

public interface DiscountPolicy {
    int discount (Member m, int price);
}
