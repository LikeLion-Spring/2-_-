package likeLion1.practice.order;

import likeLion1.practice.member.Member;
import likeLion1.practice.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private MemberRepository memberRepository;
    private DiscountPolicy discountPolicy;

    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy){
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long id, String productName, int price) {
        Member member = memberRepository.findById(id);
        int discountPrice = discountPolicy.discount(member,price);
        return new Order(id, productName, price, discountPrice);
    }
}
