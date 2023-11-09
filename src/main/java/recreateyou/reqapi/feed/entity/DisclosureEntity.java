package recreateyou.reqapi.feed.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "DISCLOSURE")
@Entity
public class DisclosureEntity implements Serializable {

    @Id
    @Column(name = "DISCLOSURE_SEQ")
    private Long disclosureSeq;

    @Column(name = "DISCLOSURE_TYPE", length = 10)
    private String disclosureType;
}
