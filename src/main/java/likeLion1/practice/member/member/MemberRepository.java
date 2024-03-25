package likeLion1.practice.member.member;

public interface MemberRepository {

    void save(Member member);
    Member findById(Long memberId);
}
