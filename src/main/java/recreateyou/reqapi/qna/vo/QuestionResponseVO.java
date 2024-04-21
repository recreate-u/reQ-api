package recreateyou.reqapi.qna.vo;

import java.time.LocalDateTime;

import recreateyou.reqapi.user.entity.UserEntity;

public record QuestionResponseVO(Long QuestionSeq, UserEntity userId, String title, String context,
		LocalDateTime regDate, LocalDateTime updDate) {

}
