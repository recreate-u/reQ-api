package recreateyou.reqapi.qna.vo;

import java.sql.Timestamp;
import java.util.Date;

import recreateyou.reqapi.user.entity.UserEntity;

public record AnswerResponseVO(Long answerSeq, UserEntity userId, String title, String context, Date regDate,
		Timestamp updDate) {

}
