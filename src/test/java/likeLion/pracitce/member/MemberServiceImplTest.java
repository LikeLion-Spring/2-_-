package likeLion.pracitce.member;

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
    //스프링 빈에서 검색을 하는 객체

    @Test
    public void autowiredTest() {

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());

        //스프링 빈에서 memberservice객체를 가져온 것
        MemberService ms = ac.getBean(MemberService.class);

        System.out.println("ms = " + ms);
        System.out.println("memberService = " + memberService);
        //-> 주입받은 객체와 스프링 빈에서 가져온 객체가 동일하다 -> 싱글톤 만족!
    }

}
