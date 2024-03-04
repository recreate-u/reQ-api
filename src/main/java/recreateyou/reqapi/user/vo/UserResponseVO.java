package recreateyou.reqapi.user.vo;

import recreateyou.reqapi.user.enums.Gender;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public record UserResponseVO(
        String userId,
        String userName,
        Timestamp birth,
        String phoneNumber,
        String emailId,
        String emailDomain,
        Boolean emailCheck,
        String zipCode,
        Gender gender,
        Long followerCount,
        LocalDateTime userRegDate,
        LocalDateTime userUpdDate,
        Boolean deleted
) {
}
