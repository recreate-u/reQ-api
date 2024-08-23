package recreateyou.reqapi.feed.vo;

import recreateyou.reqapi.feed.entity.FeedEntity;
import recreateyou.reqapi.user.entity.UserEntity;

public record FeedVO (

    String feedSeq,

    UserEntity userId,

    String textContent
){}