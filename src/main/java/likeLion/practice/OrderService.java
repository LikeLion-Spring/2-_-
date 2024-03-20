package likeLion.practice;

import likeLion.practice.member.Member;

public interface OrderService {
    void join(Member member);
    Member findMember(Long memberId);

    int discount(int price, Member member);

}
