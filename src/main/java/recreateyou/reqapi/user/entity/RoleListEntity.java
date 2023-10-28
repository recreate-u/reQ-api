package recreateyou.reqapi.user.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import recreateyou.reqapi.user.Enum.Role;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ROLE_LIST")
public class RoleListEntity {

    @Id
    @Enumerated(EnumType.STRING)
    @Column(name = "ROLE_NAME", length = 20)
    private Role roleName;
}
