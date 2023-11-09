package recreateyou.reqapi.auth.entity.compositeKey;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import recreateyou.reqapi.auth.Enum.Role;

import java.io.Serializable;

public class AuthCompositeId implements Serializable {

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "ROLE_NAME")
    @Enumerated(EnumType.STRING)
    private Role roleName;
}
