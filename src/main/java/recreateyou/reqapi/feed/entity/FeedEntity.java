package recreateyou.reqapi.feed.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import recreateyou.reqapi.feed.vo.FeedVO;
import recreateyou.reqapi.report.entity.ReportEntity;
import recreateyou.reqapi.user.entity.UserEntity;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(
        name = "FEED",
        uniqueConstraints = {@UniqueConstraint(name = "FIXED_FEED", columnNames = {"USER_ID", "FIXED_NUM"})}
)
public class FeedEntity {

    @Id
    @Column(name = "FEED_SEQ")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedSeq;

    @JoinColumn(name = "USER_ID")
    @ManyToOne
    private UserEntity userId;

    @Column(name = "TEXT_CONTENT")
    private String textContent;

    @Column(name = "LIKE_COUNT")
    private int likeCount;

    @Column(name="FIXED_NUM")
    private int fixedNum;

    @Column(name = "REG_DATE")
    @CreationTimestamp
    private LocalDateTime regDate;

    @Column(name = "UPDATE_DATE")
    @UpdateTimestamp
    private LocalDateTime updDate;

    @Column(name = "DISCLOSURE_TYPE", length = 10)
    private String disclosureType;

    @Column(name = "REPORT_COUNT")
    private int reportCount;

    @OneToMany(mappedBy = "feedSeq")
    List<ReportEntity> reports;

    public FeedEntity(Long feedSeq, FeedVO feedVO){
        this.userId = feedVO.userId();
        this.textContent = feedVO.textContent();
    }

    public FeedVO toResponseVO(){
        return null;
    }
}
