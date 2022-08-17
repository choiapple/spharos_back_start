package union.member.entity;

import lombok.*;

import javax.persistence.*;
import java.lang.annotation.Documented;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Table(name = "User")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;

//    private List<MemberRoleList> memberRoleLists;
}
