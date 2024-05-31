package recreateyou.reqapi.feed.vo;

import recreateyou.reqapi.user.entity.UserEntity;

public record FeedVO (

    String feedSeq,

    UserEntity userId,

    String textContent
){}