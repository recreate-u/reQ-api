package recreateyou.reqapi.qna.vo;

import jakarta.annotation.Nullable;
import lombok.NonNull;
import recreateyou.reqapi.user.entity.UserEntity;

public record QuestionRequestVO(@NonNull Long questionSeq, @NonNull UserEntity userId, @NonNull String title,
		@Nullable String context) {
}