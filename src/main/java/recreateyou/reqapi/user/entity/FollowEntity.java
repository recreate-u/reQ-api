package recreateyou.reqapi.user.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FOLLOW")
@IdClass(FollowCompositeId.class)   // 복합키 지정
public class FollowEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_FOLLOWER")
    private UserEntity userFollower;    // 팔로우 하기 누른 사람

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_FOLLOW")
    private UserEntity userFollow;      // 팔로우 대상
}
