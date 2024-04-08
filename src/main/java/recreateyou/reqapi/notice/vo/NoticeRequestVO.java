package recreateyou.reqapi.notice.vo;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import lombok.NonNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.util.Date;

public record NoticeRequestVO (

    @NonNull String noticeSeq,
    @NonNull String userId,
    @NonNull String title,
    @Nullable String context

){

}
