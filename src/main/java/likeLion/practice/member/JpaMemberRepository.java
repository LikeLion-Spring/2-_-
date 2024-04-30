package likeLion.practice.member;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;


@Repository
public class JpaMemberRepository implements MemberRepository{

    @PersistenceContext
    private EntityManager em;


    @Override
    public void save(Member member) {
        em.persist(member);

    }

    @Override
    public Member findById(Long memberId) {
        return em.find(Member.class, memberId);
    }
}