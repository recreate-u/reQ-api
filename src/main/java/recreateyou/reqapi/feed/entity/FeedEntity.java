package recreateyou.reqapi.feed.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import recreateyou.reqapi.report.entity.ReportEntity;

import java.util.ArrayList;
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

    @Column(name = "USER_ID", length = 50)
    private String userId;

    @Column(name = "TEXT_CONTENT")
    private String textContent;

    @Column(name = "LIKE_COUNT")
    private int likeCount;

    @Column(name="FIXED_NUM")
    private int fixedNum;

    @Column(name = "REG_DATE")
    @CreationTimestamp
    private Date regDate;

    @Column(name = "UPDATE_DATE")
    @UpdateTimestamp
    private Date updDate;

    @Column(name = "DISCLOSURE_TYPE", length = 10)
    private String disclosureType;

    @Column(name = "REPORT_COUNT")
    private int reportCount;

    @OneToMany(mappedBy = "feedSeq")
    List<ReportEntity> reports = new ArrayList<>();
}
