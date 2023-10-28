package recreateyou.reqapi.user.entity.compositeKey;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class FollowCompositeId implements Serializable {

    @Column(name = "USER_FOLLOWER")
    private String userFollower;    // 팔로우 하기 누른 사람

    @Column(name = "USER_FOLLOW")
    private String userFollow;      // 팔로우 대상
}
