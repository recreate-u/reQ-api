package recreateyou.reqapi.feed.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "COMMENT")
@Entity
public class CommentEntity {

    @Id
    @Column(name = "COMMENT_SEQ")
    private Long commentSeq;

    @Column(name = "FEED_SEQ")
    private Long feedSeq;

    @Column(name = "TEXT_CONTEXT")
    private String textContext;

    @Column(name = "REG_DATE")
    private Timestamp regDate;

    @Column(name = "UPD_DATE")
    private Timestamp updDate;
}
