package likeLion1.practice.order;

import likeLion1.practice.member.Grade;
import likeLion1.practice.member.Member;
import org.springframework.stereotype.Component;


@Component
public class FixDiscountPolicy implements  DiscountPolicy{
    int discountPrice = 1000;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price - discountPrice;
        }
        else {
            return price;
        }
    }
}
