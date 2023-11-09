package recreateyou.reqapi.user.entity;

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
public class ProfileAttachmentEntity {

    @Id
    @Column(name = "USER_ID", length = 20)
    private String userId;

    @Column(name = "FILE_NAME", length = 256)
    private String fileName;

    @Column(name = "PATH", length = 256)
    private String path;

    @Column(name = "FILE_TEXT", length = 256)
    private String fileText;
}
