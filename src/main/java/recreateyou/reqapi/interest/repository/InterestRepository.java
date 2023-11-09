package recreateyou.reqapi.interest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import recreateyou.reqapi.interest.entity.InterestEntity;

public interface InterestRepository extends JpaRepository<InterestEntity, String> {

}
