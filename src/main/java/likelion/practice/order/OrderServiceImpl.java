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
    public Order createOrder(Long orderId, String productName, int orderPrice) {
        Member m = memberRepository.findById(orderId);
        int discountAmount = discountPolicy.discount(m, orderPrice);

        return new Order(orderId, productName, orderPrice, discountAmount);
    }
}
