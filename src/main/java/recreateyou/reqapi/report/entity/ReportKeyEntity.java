package recreateyou.reqapi.report.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "REPORT_KEY")
public class ReportKeyEntity {

    @Id
    @JoinColumn
    @ManyToOne
    private ReportEntity reportReasons;
}
