package recreateyou.reqapi.notice.vo;

import recreateyou.reqapi.user.entity.UserEntity;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

public record NoticeResponseVO (
    Long noticeSeq,
    UserEntity userId,
    String title,
    String context,
    LocalDateTime regDate,
    LocalDateTime updDate
){

}
