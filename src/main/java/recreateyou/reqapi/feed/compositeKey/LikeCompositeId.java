package recreateyou.reqapi.feed.compositeKey;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class LikeCompositeId implements Serializable {

    @OneToMany
    @JoinColumn(name = "USER_ID")
    private String userId;

    @OneToMany
    @JoinColumn(name = "FEED_SEQ")
    private long feedSeq;
}
