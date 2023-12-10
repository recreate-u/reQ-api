package recreateyou.reqapi.feed.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.print.attribute.standard.MediaSize;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FEED")
public class feedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feed_seq;

    @Column(name = "USER_ID", length = 50)
    private String userId;

    @Column(name = "TEXT_CONTENT")
    private String textContent;

    @Column(name = "LIKE_COUNT")
    private int likeCount;

    @Column(name="FIXED_NUM")
    private int fixed_num;

    @Column(name = "REG_DATE")
    @CreationTimestamp
    private Date reg_date;

    @Column(name = "UPDATE_DATE")
    @UpdateTimestamp
    private Date upt_date;

    @Column(name = "DISCLOSURE_TYPE", length = 10)
    private String disclosureType;

    @Column(name = "REPORT_COUNT")
    private int reportCount;

}
