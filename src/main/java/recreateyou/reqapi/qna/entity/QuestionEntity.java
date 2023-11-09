package recreateyou.reqapi.qna.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "QUESTION")
@Entity
public class QuestionEntity {

    @Column(name = "QUESTION_SEQ")
    private Long questionSeq;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "CONTEXT")
    private String context;

    @Column(name = "REG_DATE")
    private Date regDate;
}
