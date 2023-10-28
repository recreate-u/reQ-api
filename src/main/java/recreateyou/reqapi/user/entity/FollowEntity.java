package recreateyou.reqapi.user.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import recreateyou.reqapi.user.entity.compositeKey.FollowCompositeId;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FOLLOW")
public class FollowEntity {

    @EmbeddedId     // 복합키 지정
    private FollowCompositeId followCompositeId;    // 복합키의 사용될 컬럼들에 대한 정보를 담음 + 실제 생성 테이블 정보

    @MapsId("USER_FOLLOWER")    // followCompositeId 내의 "USER_FOLLOWER" 와 userFollower 내의 id를 매핑
    @ManyToOne(fetch = FetchType.LAZY)   // 다수의 follow 테이블이 하나의 user 테이블을 참조함,+ join은 필요할때만
    @JoinColumn(name = "USER_FOLLOWER")        // 테이블 조인시 기준 컬럼
    private UserEntity userFollower;     // 테이블 조인시 사용할 필드

    @MapsId("USER_FOLLOW")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_FOLLOW")
    private UserEntity userFollow;
}
