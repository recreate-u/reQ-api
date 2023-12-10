package recreateyou.reqapi.attachment.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ATTACHMENT")
public class AttachmentEntity {

    @Id
    @GeneratedValue
    private int attachmentSEQ;

    @Column
    private int feedSeq;

    @Column(name = "TYPE",length = 20)
    private String type;

    @Column(name = "FILE_NAME",length = 256)
    private String fileName;

    @Column(name = "PATH", length = 256)
    private String path;

    @Column(name = "FILE_EXT",length = 8)
    private String fileExt;

    @Column(name = "USER_ID",length = 20)
    private String userId;
}
