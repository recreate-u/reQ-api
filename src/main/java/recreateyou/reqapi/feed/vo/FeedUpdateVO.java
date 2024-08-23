package recreateyou.reqapi.feed.vo;

import recreateyou.reqapi.feed.entity.FeedEntity;
import recreateyou.reqapi.user.entity.UserEntity;

import java.time.LocalDateTime;

public record FeedUpdateVO(
        String textContent,

        LocalDateTime updDate
) {
    public FeedEntity toEntity(Long feedSeq, UserEntity userId){
        return FeedEntity.builder()
                .feedSeq(feedSeq)
                .userId(userId)
                .textContent(this.textContent)
                .updDate(this.updDate)
                .build();
    }
}
