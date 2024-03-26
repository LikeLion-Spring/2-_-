package likeLion.practice.order;

import likeLion.practice.member.Member;
import likeLion.practice.member.MemberRepository;

public class OrderServiceImpl {

    private DiscountPolicy discountPolicy;
    private MemberRepository repository;

    public Product order(Long id, Product product) {

        Member member = repository.findById(id);
        product.price = discountPolicy.discount(member, product.price);
        return product ;
    }
}
