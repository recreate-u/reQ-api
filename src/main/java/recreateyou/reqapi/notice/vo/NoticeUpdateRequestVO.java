package recreateyou.reqapi.notice.vo;

import recreateyou.reqapi.notice.entity.NoticeEntity;
import recreateyou.reqapi.user.entity.UserEntity;

import java.time.LocalDateTime;

public record NoticeUpdateRequestVO(

        String title,

        String context,

        LocalDateTime updDate
) {
    public NoticeEntity toEntity(Long noticeSeq, UserEntity userId){
        return NoticeEntity.builder()
                .noticeSeq(noticeSeq)
                .userId(userId)
                .title(this.title)
                .context(this.context)
                .updDate(this.updDate)
                .build();
    }
}



