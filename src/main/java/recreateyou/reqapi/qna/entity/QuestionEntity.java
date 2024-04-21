package recreateyou.reqapi.qna.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import recreateyou.reqapi.notice.vo.NoticeResponseVO;
import recreateyou.reqapi.qna.vo.QuestionRequestVO;
import recreateyou.reqapi.qna.vo.QuestionResponseVO;
import recreateyou.reqapi.user.entity.UserEntity;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "QUESTION")
@IdClass(QuestionCompositeId.class)
public class QuestionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "QUESTION_SEQ")
	private Long questionSeq;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ID")
	private @NonNull UserEntity userId;

	@Column(name = "TITLE", length = 100)
	private String title;

	@Column(name = "CONTEXT", length = 1000)
	private String context;

	@Column(name = "REG_DATE")
	@CreationTimestamp
	private LocalDateTime regDate;

	@Column(name = "UPD_DATE")
	@UpdateTimestamp
	private LocalDateTime updDate;

	public QuestionEntity(Long questionSeq, QuestionRequestVO questionRequestVO) {
		this.questionSeq = questionRequestVO.questionSeq();
		this.userId = questionRequestVO.userId();
		this.title = questionRequestVO.title();
		this.context = questionRequestVO.context();
	}

	public QuestionResponseVO toResponseVO() {
		return new QuestionResponseVO(this.getQuestionSeq(), this.getUserId(), this.getTitle(), this.getContext(),
				this.getRegDate(), this.getUpdDate());
	}
}
