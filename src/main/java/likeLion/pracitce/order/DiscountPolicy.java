package likeLion.pracitce.order;

import likeLion.pracitce.member.Member;

public interface DiscountPolicy {
    int discount (Member m, int price);
}
