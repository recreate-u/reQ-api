package recreateyou.reqapi.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import recreateyou.reqapi.auth.enums.Role;
import recreateyou.reqapi.auth.service.AuthService;
import recreateyou.reqapi.user.entity.UserEntity;
import recreateyou.reqapi.user.repository.UserRepository;
import recreateyou.reqapi.user.vo.UserRequestVO;
import recreateyou.reqapi.user.vo.UserResponseVO;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final AuthService authService;

    public void joinUser(String userId, UserRequestVO userRequestVO) {
        userRepository.save(new UserEntity(userId, userRequestVO, bCryptPasswordEncoder));
        authService.grantRole(userId, Role.USER);
    }

    public UserResponseVO getUser(@PathVariable("user-id") String userId) {
        Optional<UserEntity> foundUser = userRepository.findById(userId);
        UserEntity userEntity = foundUser.orElseThrow(() -> new RuntimeException("회원 정보 없음"));
        return userEntity.toResponseVo();
    }

    public void deleteUser(@PathVariable("user-id") String userId) {
        Optional<UserEntity> foundUser = userRepository.findById(userId);
        UserEntity userEntity = foundUser.orElseThrow(() -> new RuntimeException("회원 정보 없음"));
        userEntity.setDeleted(true);
    }

    public void putUser(@PathVariable("user-id") String userId, UserRequestVO requestVO) {
        userRepository.save(new UserEntity(userId, requestVO, bCryptPasswordEncoder));
    }
}
