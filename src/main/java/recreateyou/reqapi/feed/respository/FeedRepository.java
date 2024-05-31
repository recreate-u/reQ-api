package recreateyou.reqapi.feed.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import recreateyou.reqapi.feed.entity.FeedEntity;
import recreateyou.reqapi.feed.vo.FeedVO;

@Repository
public interface FeedRepository extends JpaRepository<FeedEntity,Long> {
}
