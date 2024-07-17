package recreateyou.reqapi.user.vo;

import recreateyou.reqapi.user.entity.UserEntity;
import recreateyou.reqapi.user.enums.Gender;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record UserResponseVO(
        String userId,
        String userName,
        LocalDate birth,
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
    public static UserResponseVO from(UserEntity entity) {
        return new UserResponseVO(entity.getUserId(), entity.getUserName(), entity.getBirth(), entity.getPhoneNumber(),
                entity.getEmailId(), entity.getEmailDomain(), entity.getEmailCheck(),
                entity.getZipCode(), entity.getGender(), entity.getFollowerCount(),
                entity.getUserRegDate(), entity.getUserUpdDate(), entity.getDeleted());
    }
}
