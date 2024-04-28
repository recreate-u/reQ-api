package recreateyou.reqapi.report.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "REPORT_REASON")
public class ReportReasonEntity {

    @Id
    @Column(name = "REPORT_REASONS_SEQ")
    private Long reportReasonsSeq;


    @Column(name = "REPORT_REASONS")
    private String reportReasons;

//    @OneToMany(mappedBy = "reportReason")
//    private List<ReportEntity> reportEntities;
}
