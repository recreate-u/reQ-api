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

    @Column(name = "KEY", length = 256)
    private String key;

    @Column(name = "CONTEXT", length = 1000)
    private String context;

}
