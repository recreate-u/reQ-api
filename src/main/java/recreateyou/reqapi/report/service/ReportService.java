package recreateyou.reqapi.report.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import recreateyou.reqapi.report.entity.ReportEntity;
import recreateyou.reqapi.report.repository.ReportRepository;
import recreateyou.reqapi.report.vo.ReportRequestVO;
import recreateyou.reqapi.report.vo.ReportResponseVO;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ReportService {

    private final ReportRepository reportRepository;

    public void registerReport(Long reportSeq, ReportRequestVO reportRequestVO){
        reportRepository.save(new ReportEntity(reportSeq, reportRequestVO));
    }

    public ReportResponseVO findReport(Long reportSeq){
        Optional<ReportEntity> findReport = reportRepository.findById(reportSeq);
        ReportEntity reportEntity = findReport.orElseThrow();
        return new ReportEntity().toResponseVO();
    }

    public Long countReport(Long feedSeq){
        reportRepository.CountByFeedSeq(feedSeq);
        return null;
    }

//    public void patchReport(Long reportSeq, ReportRequestVO reportRequestVO){
//        reportRepository.save(new ReportEntity(reportSeq, reportRequestVO));
//    }

    public void deleteReport(Long reportSeq){
        reportRepository.deleteById(reportSeq);
    }
}
