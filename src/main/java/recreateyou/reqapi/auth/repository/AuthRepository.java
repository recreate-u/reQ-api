package recreateyou.reqapi.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import recreateyou.reqapi.auth.entity.AuthCompositeId;
import recreateyou.reqapi.auth.entity.AuthEntity;

public interface AuthRepository extends JpaRepository<AuthEntity, AuthCompositeId> {
}
