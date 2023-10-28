package recreateyou.reqapi.user.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import recreateyou.reqapi.user.Enum.Gender;

import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER")
public class UserEntity {

    @Id
    @Column(name = "USER_ID",length = 20)
    private String userId;          // 아이디

    @Column(name = "USER_PW", length = 60, nullable = false)
    private String userPw;          // 비밀번호 (bCrypt 인코딩)

    @Column(name = "USER_NAME", length = 30)
    private String userName;        // 이름

    @Column(name = "BIRTH")
    private Timestamp birth;        // 생년월일

    @Column(name = "PHONE_NUMBER", length = 15)
    private String phoneNumber;     // 전화번호

    @Column(name = "EMAIL_ID", length = 20)
    private String emailId;         // 이메일 아이디

    @Column(name = "EMAIL_DOMAIN", length = 30)
    private String emailDomain;     // 이메일 도메인

    @Column(name = "EMAIL_CHECK")
    private String emailCheck;      // 이메일 인증 유무

    @Column(name = "ZIP_CODE", length = 10)
    private String zipCode;         // 우편번호

    @Column(name = "GENDER")
    @Enumerated(EnumType.STRING)    // 열거형 타입을 문자열로 저장
    private Gender gender;          // 성별 Gender.F = "F" = 여자, Gender.M = "M" = 남자

    @Column(name = "FOLLOWER_COUNT")
    private long followerCount;     // 팔로워 수

    @Column(name = "USER_REG_DATE")
    @CreationTimestamp              // insert 쿼리 실행시 자동 생성
    private Date userRegDate;       // 가입일자

    @Column(name = "USER_UPD_DATE")
    @UpdateTimestamp                // update 쿼리 실행시 자동 생성
    private Timestamp userUpdDate;  // 최근수정일자

    @Column(name = "DELETED")
    private boolean deleted;        // 삭제 유무 true = 삭제됨
}
