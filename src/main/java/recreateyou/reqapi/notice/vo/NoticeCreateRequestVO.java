package recreateyou.reqapi.notice.vo;

import recreateyou.reqapi.notice.entity.NoticeEntity;
import recreateyou.reqapi.user.entity.UserEntity;

public record NoticeCreateRequestVO(
    String title,
    String context

){
    public NoticeEntity toEntity() {
        return NoticeEntity.builder()
                .title(this.title)
                .context(this.context)
                .build();
    }
}
