package recreateyou.reqapi.feed.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import recreateyou.reqapi.user.entity.UserEntity;

import java.sql.Timestamp;


@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "FEED_LIKE")
@IdClass(FeedLikeCompositeId.class)
public class FeedLikeEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID")
    private UserEntity user;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FEED_SEQ", referencedColumnName = "FEED_SEQ")
    private FeedEntity feed;

    @CreationTimestamp
    @Column(name = "LIKED_DATE")
    private Timestamp likedDate;
}
