package recreateyou.reqapi.feed.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "FEED_INTEREST")
@Entity
public class FeedInterestEntity {

    @Column(name = "FEED_SEQ")
    private Long feedSeq;

    @Column(name = "INTEREST_NAME", length = 30)
    private String interestName;
}
