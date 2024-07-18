package recreateyou.reqapi.user.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import recreateyou.reqapi.auth.entity.AuthEntity;
import recreateyou.reqapi.notice.entity.NoticeEntity;
import recreateyou.reqapi.user.enums.Gender;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
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
    private LocalDate birth;        // 생년월일

    @Column(name = "PHONE_NUMBER", length = 15)
    private String phoneNumber;     // 전화번호

    @Column(name = "EMAIL_ID", length = 20)
    private String emailId;         // 이메일 아이디

    @Column(name = "EMAIL_DOMAIN", length = 30)
    private String emailDomain;     // 이메일 도메인

    @Column(name = "EMAIL_CHECK")
    private Boolean emailCheck;      // 이메일 인증 유무

    @Column(name = "ZIP_CODE", length = 10)
    private String zipCode;         // 우편번호

    @Column(name = "GENDER")
    @Enumerated(EnumType.STRING)    // 열거형 타입을 문자열로 저장
    private Gender gender;          // 성별 Gender.F = "F" = 여자, Gender.M = "M" = 남자

    @Column(name = "FOLLOWER_COUNT")
    private Long followerCount;     // 팔로워 수

    @Column(name = "USER_REG_DATE")
    @CreationTimestamp              // insert 쿼리 실행시 자동 생성
    private LocalDateTime userRegDate;       // 가입일자

    @Column(name = "USER_UPD_DATE")
    @UpdateTimestamp                // update 쿼리 실행시 자동 생성
    private LocalDateTime userUpdDate;  // 최근수정일자

    @Column(name = "DELETED")
    private Boolean deleted;        // 삭제 유무 true = 삭제됨



    // ------------------------- 연관 관계 설정 ------------------------- //
    @OneToMany(mappedBy = "userFollower", fetch = FetchType.LAZY)   // 팔로우 대상 목록
    private List<FollowEntity> followList;

    @OneToMany(mappedBy = "userFollow", fetch = FetchType.LAZY)     // 팔로워 목록
    private List<FollowEntity> followerList;

    @OneToMany(mappedBy = "userId", fetch = FetchType.LAZY)
    private List<AuthEntity> authList;

    @OneToOne(mappedBy = "userId")
    private ProfileAttachmentEntity profileAttachment;

    @OneToMany(mappedBy = "userId")
    private List<NoticeEntity> noticeList;

    public void updateDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
