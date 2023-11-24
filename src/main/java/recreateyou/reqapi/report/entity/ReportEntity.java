package recreateyou.reqapi.report.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "REPORT")
public class ReportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reportSeq;

    @Column(name = "REPORT_REASON", length = 256)
    private String reportReason;

    @Column(name = "CONTEXT", length = 1000)
    private String context;

}
