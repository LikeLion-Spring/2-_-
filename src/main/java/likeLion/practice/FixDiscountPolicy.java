package likeLion.practice;

import likeLion.practice.member.Grade;
import org.springframework.stereotype.Repository;

@Repository
public class FixDiscountPolicy implements DiscountPolicy{
    final int fix = 1000;
    @Override
    public int applyPolicy(int price, Grade grade) {
        if(grade==Grade.VIP)
            return price-fix;
        else
            return price;
    }
}
