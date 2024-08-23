package recreateyou.reqapi.feed.vo;

import recreateyou.reqapi.feed.entity.FeedEntity;
import recreateyou.reqapi.notice.entity.NoticeEntity;
import recreateyou.reqapi.user.entity.UserEntity;
import recreateyou.reqapi.user.entity.UserEntity;

public record FeedCreateVO (
    UserEntity userId,

    String textContent
){
    public FeedEntity toEntity() {
        return FeedEntity.builder()
                .userId(this.userId)
                .textContent(this.textContent)
                .build();
    }
}