package likeLion1.practice.order;

import likeLion1.practice.member.Member;
import likeLion1.practice.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{

    private MemberRepository repos;
    private DiscountPolicy dp;

    @Autowired
    public OrderServiceImpl(MemberRepository repos, DiscountPolicy dp) {
        this.repos = repos;
        this.dp = dp;
    }

    @Override
    public Order createOrder(Long id, String productName, int price) {

        Member m = repos.findById(id);
        int discountPrice = dp.discount(m, price);

        return new Order(id, productName, price, discountPrice);
    }
}
