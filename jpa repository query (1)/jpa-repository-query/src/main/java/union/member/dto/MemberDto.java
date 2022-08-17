package union.member.dto;

import lombok.Data;

@Data
public class MemberDto {

    private String name;
    private String email;
    private String phone;
    private Long roleId;
}
