package recreateyou.reqapi.coment.entity;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "COMENT")
public class comentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int comentSeq;

    @Column(name = "FEED_SEQ")
    private int feedSeq;

    @Column(name = "TEXT_CONTEXT" , length = 1000)
    private String textContext;

    @Column(name = "REG_DATE")
    @Timestamp
    private Date regDate;

    @Column(name = "UPD_DATE")
    @Timestamp
    private Date updDate;

}
