package recreateyou.reqapi.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "USER_INTEREST")
@Entity
public class UserInterestEntity {

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "INTEREST_NAME")
    private String interestName;
}
