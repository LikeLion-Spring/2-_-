package likeLion.practice;

import likeLion.practice.member.Grade;
import likeLion.practice.member.Member;
import likeLion.practice.member.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class MemberServiceImplTest {
    @Autowired
    public MemberService memberService;

    @Autowired
    public ApplicationContext ac;

    @Test
    public void autowiredTest() {

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());

        MemberService ms = ac.getBean(MemberService.class);

        System.out.println("ms = " + ms);
        System.out.println("memberService = " + memberService);



    }

}
