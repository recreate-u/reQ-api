package recreateyou.reqapi.feed.entity;

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
@Table(name = "ATTATCHMENT")
@Entity
public class AttachmentEntity {

    @Id
    @Column(name = "ATTATCHEMENT_SEQ")
    private Long attatchmentSeq;

    @Column(name = "FEED_SEQ")
    private Long feedSeq;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "FILE_NAME")
    private String fileName;

    @Column(name = "PATH")
    private String path;

    @Column(name = "FILE_EXT")
    private String fileExt;

    @Column(name = "USER_ID")
    private String userId;
}
