package recreateyou.reqapi.report.entity;

import jakarta.persistence.*;
import lombok.*;
import recreateyou.reqapi.feed.entity.FeedEntity;
import recreateyou.reqapi.report.vo.ReportRequestVO;
import recreateyou.reqapi.report.vo.ReportResponseVO;

@Getter
@Setter
@Builder
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Entity
@Table(name = "REPORT")
public class ReportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REPORT_SEQ")
    private Long reportSeq;

    @Column(name = "CONTEXT", length = 1000)
    private String context;

    @JoinColumn(name = "FEED_SEQ")
    @ManyToOne(fetch = FetchType.LAZY)
    private FeedEntity feedSeq;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REPORT_REASONS_SEQ")
    private ReportReasonEntity reportReason;

    public ReportEntity(Long reportSeq, ReportRequestVO reportRequestVO){
        this.reportSeq = reportRequestVO.reportSeq();
        this.context = reportRequestVO.context();
    }

    public ReportResponseVO toResponseVO(){
        return new ReportResponseVO(this.getReportSeq(), this.getContext());
    }
}
