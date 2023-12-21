package recreateyou.reqapi.interest.entity;

import jakarta.persistence.*;
import lombok.*;
import recreateyou.reqapi.user.entity.UserEntity;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER_INTEREST")
@IdClass(UserInterestCompositeId.class)
public class UserInterestEntity {

	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ID")
	private UserEntity userId;

	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INTEREST_NAME")
	private InterestEntity interestName;
}
