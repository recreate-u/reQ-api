package recreateyou.reqapi.notice.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import recreateyou.reqapi.notice.service.NoticeService;
import recreateyou.reqapi.notice.vo.NoticeRequestVO;
import recreateyou.reqapi.notice.vo.NoticeResponseVO;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/notice")
public class NoticeController {

    private final NoticeService noticeService;

    @Operation(tags = {"notice"}, summary = "공지등록")
    @PostMapping("/{notice-seq}")
    public void registerNotice(@PathVariable("notice-seq")Long noticeSeq, @RequestBody NoticeRequestVO noticeRequestVO){
        noticeService.registerNotice(noticeSeq, noticeRequestVO);
    }

    // 공지 개별로 확인
    @Operation(tags = {"notice"}, summary = "공지 개별로 확인")
    @GetMapping("/{notice-seq}")
    public NoticeResponseVO getNotice(@PathVariable("notice-seq") Long noticeSeq){
        return noticeService.getNotice(noticeSeq);
    }

    // 전체 공지
    @Operation(tags = {"notice"}, summary = "전체 공지")
    @GetMapping
    public List<NoticeResponseVO> getAllNotice(){
        return noticeService.getAllNotice();
    }

    @Operation(tags = {"notice"}, summary = "공지 수정")
    @PatchMapping("/{notice-seq}")
    public void patchNotice(@PathVariable("notice-seq") Long noticeSeq, @RequestBody NoticeRequestVO noticeRequestVO){
        noticeService.patchNotice(noticeSeq, noticeRequestVO);
    }

    @Operation(tags = {"notice"}, summary = "공지 삭제")
    @DeleteMapping("/{notice-seq}")
    public void deleteNotice(@PathVariable("notice-seq") Long noticeSeq){
        noticeService.deleteNotice(noticeSeq);
    }
}
