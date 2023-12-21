package recreateyou.reqapi.feed.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FEED")
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

}
