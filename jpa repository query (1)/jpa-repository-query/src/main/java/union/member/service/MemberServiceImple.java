package union.member.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import union.member.dto.MemberDto;
import union.member.entity.Member;
import union.member.entity.MemberRoleList;
import union.member.repository.IMemberRepository;
import union.member.repository.IMemberRoleListRepository;
import union.member.repository.IRoleRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class MemberServiceImple implements IMemverService{

    private final IMemberRepository iMemberRepository;
    private final IRoleRepository iRoleRepository;
    private final IMemberRoleListRepository iMemberRoleListRepository;

    @Override
    public Member addMember(MemberDto memberDto){
        Member member = iMemberRepository.save(
          Member.builder()
                  .name(memberDto.getName())
                  .phone(memberDto.getPhone())
                  .email(memberDto.getEmail())
                  .build()
        );
        iMemberRoleListRepository.save(
          MemberRoleList.builder()
                  .role(iRoleRepository.findById(memberDto.getRoleId()).get())
                  .member(member)
                  .build()
        );
        return member;
    }

    @Override
    public List<Member> getAll(){
        return iMemberRepository.findAll();
    }
    @Override
    public Long getNumberByRole(Long roleId){
        Long number = Long.valueOf(iMemberRoleListRepository.findAllByRoleId(roleId).size());

        return number;
    }
    @Override
    public Long getNumber(Long roleId){
        return null;
    }
}
