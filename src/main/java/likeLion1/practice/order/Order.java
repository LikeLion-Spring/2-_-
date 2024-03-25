package likeLion1.practice.order;

import likeLion1.practice.member.Member;
import likeLion1.practice.member.MemberRepository;

public class Order {
    private Long memberId;
    private String itemName;
    private int itemPrice;

    public Order(Long memberId, String itemName, int itemPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }
}
