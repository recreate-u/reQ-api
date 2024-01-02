package recreateyou.reqapi.report.entity;

import jakarta.persistence.*;
import lombok.*;
import recreateyou.reqapi.feed.entity.FeedEntity;

import java.util.ArrayList;
import java.util.List;

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

    @Column(name = "CONTEXT", length = 1000)
    private String context;

    @JoinColumn(name = "FEED_SEQ")
    @ManyToOne
    private FeedEntity feedSeq;

    @OneToMany(mappedBy = "reportReason")
    List<ReportKeyEntity> ReportReasons = new ArrayList<>();
}
