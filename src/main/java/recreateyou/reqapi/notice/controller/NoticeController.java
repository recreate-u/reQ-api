package recreateyou.reqapi.notice.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import recreateyou.reqapi.notice.service.NoticeService;
import recreateyou.reqapi.notice.vo.NoticeCreateRequestVO;
import recreateyou.reqapi.notice.vo.NoticeResponseVO;
import recreateyou.reqapi.notice.vo.NoticeUpdateRequestVO;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/notice")
public class NoticeController {

    private final NoticeService noticeService;

    @Operation(tags = {"notice"}, summary = "공지등록")
    public void registerNotice(@RequestBody NoticeCreateRequestVO noticeCreateRequestVO){
        noticeService.registerNotice(noticeCreateRequestVO);
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
    @PutMapping("/{notice-seq}")
    public void putNotice(@PathVariable("notice-seq") Long noticeSeq, @RequestBody NoticeUpdateRequestVO noticeUpdateRequestVO){
        noticeService.putNotice(noticeSeq, noticeUpdateRequestVO);
    }

    @Operation(tags = {"notice"}, summary = "공지 삭제")
    @DeleteMapping("/{notice-seq}")
    public void deleteNotice(@PathVariable("notice-seq") Long noticeSeq){
        noticeService.deleteNotice(noticeSeq);
    }
}
