package recreateyou.reqapi.user.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PROFILE_ATTACHMENT")
public class ProfileAttachmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long profileAttachmentSeq;

    @OneToOne
    private UserEntity userId;

    @Column(name = "FILE_NAME", length = 256)
    private String filename;

    @Column(name = "PATH", length = 256)
    private String path;

    @Column(name = "FILE_EXT", length = 4)
    private String fileExt;
}
