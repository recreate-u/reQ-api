package recreateyou.reqapi.report.entity;

import jakarta.persistence.*;
import lombok.*;
import recreateyou.reqapi.report.vo.ReportRequestVO;
import recreateyou.reqapi.report.vo.ReportResponseVO;

import java.util.List;

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
    @ManyToOne
    private @NonNull Long feedSeq;

    @OneToMany(mappedBy = "reportReasons")
    @NonNull
    private String ReportReasons;

    public ReportEntity(Long reportSeq, ReportRequestVO reportRequestVO){
        this.reportSeq = reportRequestVO.reportSeq();
        this.context = reportRequestVO.context();
        this.feedSeq = reportRequestVO.feedSeq();
        this.ReportReasons = reportRequestVO.reportReason();
    }

    public ReportResponseVO toResponseVO(){
        return new ReportResponseVO(this.getReportSeq(), this.getContext(), this.getFeedSeq(), this.getReportReasons());
    }
}
