package recreateyou.reqapi.interest.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "INTEREST")
public class InterestEntity {

    @Id
    @Column(name = "INTEREST_NAME", length = 30)
    private String interestName;

    @Column(name = "USER_COUNT")
    private Long userCount;
}
