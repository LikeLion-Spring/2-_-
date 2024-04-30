package likeLion.practice;

import likeLion.practice.member.MemberRepository;
import likeLion.practice.member.MemberService;
import likeLion.practice.member.MemberServiceImpl;
import likeLion.practice.member.MemoryMemberRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
