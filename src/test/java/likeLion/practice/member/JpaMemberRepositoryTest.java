package likeLion.practice.member;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@SpringBootTest
@Rollback(false)
class JpaMemberRepositoryTest {

    @PersistenceContext
    public EntityManager em;

    @Autowired
    public MemberRepository mr;


    @Test
    @Transactional
    public void JpaMemberReposTest(){
        Member member = new Member("곽민재", Grade.VIP);
        Member member1 = new Member("곽민재",Grade.VIP);
        Member member2 = new Member("강찬욱",Grade.BASIC);
        Member member3 = new Member("한규현",Grade.BASIC);
        Member member4 = new Member("노민영",Grade.VIP);
        mr.save(member1);
        mr.save(member);
        mr.save(member2);
        mr.save(member3);
        mr.save(member4);

        //JPQL 테스트
        String name = "곽민재";
        List<Member> findByNameMember = em.createQuery("select m from Member as m where m.name=:name",Member.class)
                .setParameter("name", name)
                .getResultList();

        for(Member m : findByNameMember){
            System.out.println(m.getName());
        }

        //페이징 테스트
        List<Member> findAllMember = em.createQuery("select m from Member as m",Member.class)
                .setFirstResult(1)
                .setMaxResults(3)
                .getResultList();

        for(Member m : findAllMember){
            System.out.println(m.getName());
        }

    }

}