package recreateyou.reqapi.report.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import recreateyou.reqapi.report.service.ReportService;
import recreateyou.reqapi.report.vo.ReportRequestVO;
import recreateyou.reqapi.report.vo.ReportResponseVO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/report")
public class ReportController {

    private final ReportService reportService;

    //신고 등록
    @PostMapping("/{report-seq}")
    public void registerReport(@PathVariable("report-seq")Long reportSeq, @RequestBody ReportRequestVO reportRequestVO){
        reportService.registerReport(reportSeq, reportRequestVO);
    }

    //신고내용 조회
    @GetMapping("/{report-seq}")
    public ReportResponseVO findReport(@PathVariable("report-seq") Long reportSeq){
        return reportService.findReport(reportSeq);
    }

    //게시물 당 신고 횟수
    @GetMapping("/{feed-seq}")
    public Long countReport(@PathVariable("feed-seq") Long feedSeq) {
        return reportService.countReport(feedSeq);
    }

//    @PatchMapping("/{report-seq}")
//    public void patchReport(@PathVariable("report-seq") Long reportSeq, @RequestBody ReportRequestVO reportRequestVO){
//        reportService.patchReport(reportSeq, reportRequestVO);
//    }

    //신고 취소
    @DeleteMapping("/{report-seq}")
    public void deleteReport(@PathVariable("report-seq") Long reportSeq){
        reportService.deleteReport(reportSeq);
    }
}
