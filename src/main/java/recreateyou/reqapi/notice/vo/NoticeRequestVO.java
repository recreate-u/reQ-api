package recreateyou.reqapi.notice.vo;

import recreateyou.reqapi.user.entity.UserEntity;

public record NoticeRequestVO (

    String noticeSeq,
    UserEntity userId,
    String title,
    String context

){

}
