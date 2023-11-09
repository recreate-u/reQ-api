package recreateyou.reqapi.feed.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "FEED")
@Entity
public class FeedEntity {

    @Id
    @Column(name = "FEED_SEQ")
    private Long feedSeq;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "TEXT_CONTENT")
    private String textContent;

    @Column(name = "LIKE_COUNT")
    private Long likeCount;

    @Column(name = "FIXED_NUM")
    private int fixedNum;

    @Column(name = "REG_DATE")
    private Timestamp regDate;

    @Column(name = "UPD_DATE")
    private Timestamp updDate;

    @Column(name = "DISCLOSURE")
    private DisclosureEntity disclosure;

    @Column(name = "REPORT_COUNT")
    private Long reportCount;
}
