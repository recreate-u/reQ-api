package recreateyou.reqapi.notice.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import recreateyou.reqapi.notice.vo.NoticeRequestVO;
import recreateyou.reqapi.notice.vo.NoticeResponseVO;
import recreateyou.reqapi.user.entity.UserEntity;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Entity
@Table(name = "NOTICE")
public class NoticeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NOTICE_SEQ")
    private Long noticeSeq;

    @JoinColumn(name = "USER_ID")
    @ManyToOne
    private UserEntity userId;

    @Column(name = "TITLE", length = 100)
    private String title;

    @Column(name = "CONTEXT", length = 1000)
    private String context;

    @Column(name = "REG_DATE")
    @CreationTimestamp
    private LocalDateTime regDate;

    @Column(name = "UPD_DATE")
    @UpdateTimestamp
    private LocalDateTime updDate;

    public NoticeEntity(Long noticeSeq, NoticeRequestVO noticeRequestVO){
        this.noticeSeq = Long.valueOf(noticeRequestVO.noticeSeq());
        this.userId = noticeRequestVO.userId();
        this.title = noticeRequestVO.title();
        this.context = noticeRequestVO.context();
    }

    public NoticeResponseVO toResponseVO(){
        return new NoticeResponseVO(this.getNoticeSeq(), this.getUserId(), this.getTitle(), this.getContext(), this.getRegDate(), this.getUpdDate() );
    }
}
