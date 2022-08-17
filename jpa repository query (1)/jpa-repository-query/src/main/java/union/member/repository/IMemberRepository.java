package union.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import union.member.entity.Member;

public interface IMemberRepository extends JpaRepository<Member, Long> {
}
