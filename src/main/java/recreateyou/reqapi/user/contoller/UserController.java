package recreateyou.reqapi.user.contoller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import recreateyou.reqapi.user.service.UserService;
import recreateyou.reqapi.user.vo.UserRequestVO;
import recreateyou.reqapi.user.vo.UserResponseVO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Operation(tags = {"user"}, summary = "회원 가입", description = "데이터에 담긴 비밀번호는 Hashing 한 뒤 DB에 저장되며 추가로 일반 유저 권한을 부여함")
    @PostMapping("/{user-id}")
    public void joinUser(@PathVariable("user-id") String userId, @RequestBody @Valid UserRequestVO userRequestVO) {
        userService.joinUser(userId, userRequestVO);
    }

    @Operation(tags = {"user"}, summary = "유저 정보 조회", description = "{user-id} 를 기준으로 조회하여 응답")
    @GetMapping("/{user-id}")
    public UserResponseVO getUser(@PathVariable("user-id") String userId) {
        return userService.getUser(userId);
    }

    @Operation(tags = {"user"}, summary = "유저 정보 삭제", description = "{user-id} 를 기준으로 deleted 컬럼의 값을 \"true\" 로 변경")
    @DeleteMapping("/{user-id}")
    public void deleteUser(@PathVariable("user-id") String userId) {
        userService.deleteUser(userId);
    }

    @Operation(tags = {"user"}, summary = "유저 정보 전체 업데이트", description = "{user-id} 를 기준으로 데이터를 수정. 요청 필드에 값이 없으면 해당 값은 \"null\" 이 되어 DB의 기존 값을 덮어씀")
    @PutMapping("/{user-id}")
    public void putUser(@PathVariable("user-id") String userId, @RequestBody @Valid UserRequestVO userRequestVO) {
        userService.putUser(userId, userRequestVO);
    }
}
