package recreateyou.reqapi.report.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import recreateyou.reqapi.report.entity.ReportEntity;
import recreateyou.reqapi.report.repository.ReportRepository;
import recreateyou.reqapi.report.vo.ReportRequestVO;
import recreateyou.reqapi.report.vo.ReportResponseVO;

import java.util.Optional;


@Service
@Transactional
@RequiredArgsConstructor
public class ReportService {

    private final ReportRepository reportRepository;

    // 신고 등록
    public void registerReport(Long reportSeq, ReportRequestVO reportRequestVO){
        reportRepository.save(new ReportEntity(reportSeq, reportRequestVO));
    }

    // 신고내용 조회
    public ReportResponseVO findReport(Long reportSeq){
        Optional<ReportEntity> findReport = reportRepository.findById(reportSeq);
        ReportEntity reportEntity = findReport.orElseThrow();
        return new ReportEntity().toResponseVO();
    }

    // 게시물 당 신고 횟수
    public Long countReport(Long feedSeq){
        Long countFeed = reportRepository.countByFeedSeq(feedSeq);
        return countFeed;

    }

//    public void patchReport(Long reportSeq, ReportRequestVO reportRequestVO){
//        reportRepository.save(new ReportEntity(reportSeq, reportRequestVO));
//    }

    // 신고 취소
    public void deleteReport(Long reportSeq){
        reportRepository.deleteById(reportSeq);
    }
}
