package likeLion1.practice.member;

public interface MemberRepository {

    void save(Member member);
    Member findById(Long memberId);
}
