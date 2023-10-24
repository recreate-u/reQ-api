package recreateyou.reqapi.like.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "LIKE")
@Entity
public class likeInfo {

    private String userId;

    private long feedSeq;

    private Date likedDate;
}
