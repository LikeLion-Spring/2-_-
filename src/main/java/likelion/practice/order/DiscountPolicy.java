package likelion.practice.order;

import likelion.practice.member.Member;

public interface DiscountPolicy {
    int discount(Member m, int orderPrice);
}
