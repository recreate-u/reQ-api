package recreateyou.reqapi.auth.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import recreateyou.reqapi.auth.entity.AuthCompositeId;
import recreateyou.reqapi.auth.entity.AuthEntity;
import recreateyou.reqapi.auth.entity.RoleListEntity;
import recreateyou.reqapi.auth.enums.Role;
import recreateyou.reqapi.auth.repository.AuthRepository;
import recreateyou.reqapi.user.entity.UserEntity;

@Service
@RequiredArgsConstructor
@Transactional
public class AuthService {

    private final AuthRepository authRepository;

    public void grantRole(String id, Role role) {
        UserEntity user = UserEntity.builder().userId(id).build();
        RoleListEntity roleEntity = RoleListEntity.builder().roleName(role).build();
        AuthEntity authEntity = new AuthEntity(user, roleEntity);

        authRepository.save(authEntity);
    }

    public void revokeRole(String id, Role role) {
        authRepository.deleteById(new AuthCompositeId(id, role));
    }
}
