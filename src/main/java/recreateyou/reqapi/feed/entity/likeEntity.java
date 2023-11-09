package recreateyou.reqapi.feed.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import recreateyou.reqapi.feed.compositeKey.LikeCompositeId;

import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "LIKE")
@Entity
public class likeEntity {

    @EmbeddedId
    private LikeCompositeId likeCompositeId;

    @Column(name = "LIKED_DATE")
    private Date likedDate;
}
