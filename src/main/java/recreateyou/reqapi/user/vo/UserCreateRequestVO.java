package recreateyou.reqapi.user.vo;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.security.crypto.password.PasswordEncoder;
import recreateyou.reqapi.user.entity.UserEntity;
import recreateyou.reqapi.user.enums.Gender;

import java.time.LocalDate;

public record UserCreateRequestVO(
        @NonNull String userId,
        @NonNull String userPW,
        @NonNull String userName,
        @Nullable LocalDate birth,
        @Nullable String phoneNumber,
        @NonNull String emailId,
        @NonNull String emailDomain,
        @Nullable String zipCode,
        @Nullable Gender gender
) {
    public UserEntity toEntity(PasswordEncoder passwordEncoder) {
        return UserEntity.builder()
                .userId(this.userId)
                .userPw(passwordEncoder.encode(this.userPW))
                .userName(this.userName)
                .birth(this.birth)
                .phoneNumber(this.phoneNumber)
                .emailId(this.emailId)
                .emailDomain(this.emailDomain)
                .emailCheck(false)
                .zipCode(this.zipCode)
                .gender(this.gender)
                .build();
    }
}
