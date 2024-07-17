package recreateyou.reqapi.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import recreateyou.reqapi.auth.enums.Role;
import recreateyou.reqapi.auth.service.AuthService;
import recreateyou.reqapi.user.entity.UserEntity;
import recreateyou.reqapi.user.repository.UserRepository;
import recreateyou.reqapi.user.vo.UserCreateRequestVO;
import recreateyou.reqapi.user.vo.UserResponseVO;
import recreateyou.reqapi.user.vo.UserUpdateRequestVo;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final AuthService authService;

    public void joinUser(UserCreateRequestVO userRequestVO) {
        userRepository.save(userRequestVO.toEntityWithPwEncode(bCryptPasswordEncoder));
        authService.grantRole(userRequestVO.userId(), Role.USER);
    }

    public UserResponseVO getUser(String userId) {
        UserEntity userEntity = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("회원 정보 없음"));
        return UserResponseVO.from(userEntity);
    }

    public void deleteUser(String userId) {
        UserEntity userEntity = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("회원 정보 없음"));
        userEntity.updateDeleted(true);
    }

    public void putUser(String userId, UserUpdateRequestVo requestVO) {
        userRepository.save(requestVO.toUserEntityWithIdAndPwEncode(userId, bCryptPasswordEncoder));
    }
}
