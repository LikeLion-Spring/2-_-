package likeLion1.practice.member.member.member.member;

public interface MemberRepository {

    void save(Member member);
    Member findById(Long memberId);
}
