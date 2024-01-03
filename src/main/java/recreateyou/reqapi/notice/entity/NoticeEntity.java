package recreateyou.reqapi.notice.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import recreateyou.reqapi.user.entity.UserEntity;

import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
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
    private Date regDate;

    @Column(name = "UPD_DATE")
    @UpdateTimestamp
    private Timestamp updDate;
}
