package recreateyou.reqapi.user.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import recreateyou.reqapi.user.entity.compositeKey.AuthCompositeId;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AUTH")
public class AuthEntity {

    @EmbeddedId
    private AuthCompositeId authCompositeId;

    @MapsId("USER_ID")                  // UserEntity의 ID를 복합키의 컬럼중 어느 컬럼의 외래키로 쓸지 설정(복합키를 쓸때만 사용하는 어노테이션)
    @JoinColumn(name = "USER_ID")       // 조인시 사용할 컬럼("AUTH" 테이블 의 컬럼)
    @ManyToOne(fetch = FetchType.LAZY)
    private UserEntity user;

    @MapsId("ROLE_NAME")
    @JoinColumn(name = "ROLE_NAME")
    @OneToOne(fetch = FetchType.LAZY)
    private RoleListEntity role;
}
