package recreateyou.reqapi.interest.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "INTEREST")
@Entity
public class InterestEntity {

    @Id
    @Column(name = "INTEREST_NAME", nullable = false)
    private String interestName;

    @Column(name = "USER_COUNT")
    private long userCount;


}
