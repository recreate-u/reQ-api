package recreateyou.reqapi.interest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER_INTEREST")
public class UserInterestEntity {

    @Id
    @Column(name = "USER_ID", length = 20)
    private String userId;

    @Column(name = "INTEREST_NAME", length = 30)
    private String interestName;
}
