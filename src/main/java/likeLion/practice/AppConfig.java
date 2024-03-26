package likeLion.practice;

import likeLion.practice.discount.DiscountPolicy;
import likeLion.practice.discount.FixDiscountPolicy;
import likeLion.practice.discount.RateDiscountPolicy;
import likeLion.practice.member.MemberRepository;
import likeLion.practice.member.MemberService;
import likeLion.practice.member.MemberServiceImpl;
import likeLion.practice.member.MemoryMemberRepository;
import likeLion.practice.order.OrderService;
import likeLion.practice.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

}

