package union.member.service;

import union.member.dto.MemberDto;
import union.member.entity.Member;

import java.util.List;

public interface IMemverService {
    Member addMember(MemberDto memberDto);
    List<Member> getAll();
    Long getNumberByRole(Long roleId);

    Long getNumber(Long roleId);
}
