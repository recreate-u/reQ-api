package recreateyou.reqapi.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import recreateyou.reqapi.user.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
}
