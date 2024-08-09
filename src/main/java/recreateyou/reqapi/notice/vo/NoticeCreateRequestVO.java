package recreateyou.reqapi.notice.vo;

import recreateyou.reqapi.notice.entity.NoticeEntity;
import recreateyou.reqapi.user.entity.UserEntity;

public record NoticeCreateRequestVO(

    Long noticeSeq,
    String title,
    String context

){
    public NoticeEntity toEntity() {
        return NoticeEntity.builder()
                .noticeSeq(this.noticeSeq)
                .title(this.title)
                .context(this.context)
                .build();
    }
}
