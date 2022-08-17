package union.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import union.member.entity.Role;

public interface IRoleRepository extends JpaRepository<Role, Long> {
}
