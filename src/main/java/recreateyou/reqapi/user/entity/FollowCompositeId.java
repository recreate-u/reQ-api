package recreateyou.reqapi.user.entity;

import java.io.Serializable;


public class FollowCompositeId implements Serializable {
    private String userFollower;    // 팔로우 하기 누른 사람
    private String userFollow;      // 팔로우 대상
}
