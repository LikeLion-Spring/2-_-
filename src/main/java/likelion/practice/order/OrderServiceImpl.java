package likelion.practice.order;

import likelion.practice.member.Member;
import likelion.practice.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private MemberRepository memberRepository;
    private DiscountPolicy discountPolicy;

    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long id, String name, int price) {

        Member member = memberRepository.findById(id);
        int discountedPrice = discountPolicy.discount(member, price);

        return new Order(id, name, price, discountedPrice);
    }
}
