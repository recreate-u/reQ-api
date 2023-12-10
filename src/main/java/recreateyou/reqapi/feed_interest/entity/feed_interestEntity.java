package recreateyou.reqapi.feed_interest.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FEED_INTEREST")
public class feed_interestEntity {

    @Id
    @GeneratedValue
    private int feed_seq;

    @Column(name = "INTEREST_NAME", length = 30)
    private String interestName;
}
