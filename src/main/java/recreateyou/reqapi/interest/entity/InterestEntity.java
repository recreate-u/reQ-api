package recreateyou.reqapi.interest.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Interest")
public class InterestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long interestSeq;

    @Column(name = "INTEREST_NAME", length = 30)
    private String interestName;
}
