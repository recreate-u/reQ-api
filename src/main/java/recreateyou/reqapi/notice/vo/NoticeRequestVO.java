package recreateyou.reqapi.notice.vo;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import lombok.NonNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import recreateyou.reqapi.user.entity.UserEntity;

import java.sql.Timestamp;
import java.util.Date;

public record NoticeRequestVO (

    String noticeSeq,
    UserEntity userId,
    String title,
    String context

){

}
