package recreateyou.reqapi.notice.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import recreateyou.reqapi.notice.entity.NoticeEntity;
import recreateyou.reqapi.notice.service.NoticeService;
import recreateyou.reqapi.notice.vo.NoticeRequestVO;
import recreateyou.reqapi.notice.vo.NoticeResponseVO;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/notice")
public class NoticeController {

    private final NoticeService noticeService;

    @PostMapping("/{notice-seq}")
    public void registerNotice(@PathVariable("notice-seq")String noticeSeq, @RequestBody NoticeRequestVO noticeRequestVO){
        noticeService.registerNotice(noticeSeq, noticeRequestVO);
    }

    // 공지 개별로 확인
    @GetMapping("/{notice-seq}")
    public NoticeResponseVO getNotice(@PathVariable("notice-seq") String noticeSeq){
        return noticeService.getNotice(noticeSeq);
    }

    // 전체 공지
    @GetMapping
    public List<NoticeResponseVO> getAllNotice(){
        return noticeService.getAllNotice();
    }

    @PatchMapping("/{notice-seq}")
    public void patchNotice(@PathVariable("notice-seq") String noticeSeq, @RequestBody NoticeRequestVO noticeRequestVO){
        noticeService.patchNotice(noticeSeq, noticeRequestVO);
    }

    @DeleteMapping("/{notice-seq}")
    public void deleteNotice(@PathVariable("notice-seq") String noticeSeq){
        noticeService.deleteNotice(noticeSeq);
    }
}
