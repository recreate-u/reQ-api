package recreateyou.reqapi.interest.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "USER_INFO")
@Entity
public class InterestInfo {

    @Id
    private String interstName;

    @Column
    private long userCount;
}
