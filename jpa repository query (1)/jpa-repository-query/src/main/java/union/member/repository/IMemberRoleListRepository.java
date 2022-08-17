package union.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import union.member.entity.MemberRoleList;

import java.util.List;

public interface IMemberRoleListRepository extends JpaRepository<MemberRoleList,Long> {
    List<MemberRoleList> findAllByRoleId(Long roleId);

    @Query(value = "select count(m) from MemberRoleList m where m.roleId=:roleId")
    Long getNumber(@Param("roleId") Long roleId);
}
