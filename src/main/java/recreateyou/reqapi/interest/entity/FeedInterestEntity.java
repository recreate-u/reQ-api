package recreateyou.reqapi.interest.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FEED_INTEREST")
public class FeedInterestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedSeq;

    @Column(name = "INTEREST_NAME", length = 30)
    private String interestName;
}
