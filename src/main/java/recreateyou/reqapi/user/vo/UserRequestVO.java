package recreateyou.reqapi.user.vo;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import recreateyou.reqapi.user.enums.Gender;

import java.sql.Timestamp;
import java.time.LocalDate;

public record UserRequestVO(
        @NonNull String userPW,
        @NonNull String userName,
        @Nullable LocalDate birth,
        @Nullable String phoneNumber,
        @NonNull String emailId,
        @NonNull String emailDomain,
        @Nullable String zipCode,
        @Nullable Gender gender
) {
}
