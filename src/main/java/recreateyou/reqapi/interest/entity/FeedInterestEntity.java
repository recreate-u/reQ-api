package recreateyou.reqapi.interest.entity;

import jakarta.persistence.*;
import lombok.*;
import recreateyou.reqapi.feed.entity.FeedEntity;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FEED_INTEREST")
@IdClass(FeedInterestCompositeId.class)
public class FeedInterestEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FEED_SEQ")
    private FeedEntity feedSeq;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INTEREST_NAME")
    private InterestEntity interestName;
}
