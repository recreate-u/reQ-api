package recreateyou.reqapi.qna.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.sql.Date;
import java.sql.Timestamp;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "ANSWER")
@Entity
public class AnswerEntity {

    @Column(name = "ANSWER_SEQ")
    private Long answerSeq;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "CONTEXT")
    private String context;

    @Column(name = "REG_DATE")
    private Date regDate;
}
