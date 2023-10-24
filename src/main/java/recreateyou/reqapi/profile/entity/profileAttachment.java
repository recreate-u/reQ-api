package recreateyou.reqapi.profile.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "PROFILE_ATTACHMENT")
@Entity
public class profileAttachment {

    @Id
    private String userId;

    @Column
    private String fileName;

    @Column
    private String path;

    @Column
    private String fileText;
}
