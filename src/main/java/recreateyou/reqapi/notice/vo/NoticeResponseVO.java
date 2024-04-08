package recreateyou.reqapi.notice.vo;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

public record NoticeResponseVO (
    Long noticeSeq,
    String userId,
    String title,
    String context,
    LocalDateTime regDate,
    LocalDateTime updDate
){

}
