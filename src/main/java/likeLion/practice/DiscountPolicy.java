package likeLion.practice;

import likeLion.practice.member.Grade;
import org.springframework.stereotype.Repository;

public interface DiscountPolicy {
    int applyPolicy(int price, Grade grade);
}
