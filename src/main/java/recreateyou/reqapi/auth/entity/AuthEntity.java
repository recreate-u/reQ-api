package recreateyou.reqapi.auth.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import recreateyou.reqapi.user.entity.UserEntity;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AUTH")
@IdClass(AuthCompositeId.class)
public class AuthEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private UserEntity userId;

    @Id
    @JoinColumn(name = "ROLE_NAME")
    @ManyToOne(fetch = FetchType.LAZY)
    private RoleListEntity roleName;
}
