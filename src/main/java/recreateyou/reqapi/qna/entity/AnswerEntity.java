package recreateyou.reqapi.qna.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import recreateyou.reqapi.user.entity.UserEntity;

import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ANSWER")
@IdClass(AnswerCompositeId.class)
public class AnswerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long answerSeq;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private UserEntity userId;

    @Column(name = "TITLE", length = 100)
    private String title;

    @Column(name = "CONTEXT", length = 1000)
    private String context;

    @Column(name = "REG_DATE")
    @CreationTimestamp
    private Date regDate;

    @Column(name = "UPD_DATE")
    @UpdateTimestamp
    private Timestamp updDate;
}
