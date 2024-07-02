package recreateyou.reqapi.notice.vo;

import recreateyou.reqapi.user.entity.UserEntity;

import java.time.LocalDateTime;

public record NoticeResponseVO (
    Long noticeSeq,
    UserEntity userId,
    String title,
    String context,
    LocalDateTime regDate,
    LocalDateTime updDate
){

}
