package recreateyou.reqapi.user.vo;

import lombok.Builder;
import recreateyou.reqapi.user.entity.UserEntity;
import recreateyou.reqapi.user.enums.Gender;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
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
        return UserResponseVO.builder()
                .userId(entity.getUserId())
                .userName(entity.getUserName())
                .birth(entity.getBirth())
                .phoneNumber(entity.getPhoneNumber())
                .emailId(entity.getEmailId())
                .emailDomain(entity.getEmailDomain())
                .emailCheck(false)
                .zipCode(entity.getZipCode())
                .gender(entity.getGender())
                .followerCount(entity.getFollowerCount())
                .userRegDate(entity.getUserRegDate())
                .userUpdDate(entity.getUserUpdDate())
                .deleted(entity.getDeleted())
                .build();
    }
}
