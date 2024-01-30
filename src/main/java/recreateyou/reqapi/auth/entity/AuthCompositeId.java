package recreateyou.reqapi.auth.entity;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import recreateyou.reqapi.auth.enums.Role;

import java.io.Serializable;

public class AuthCompositeId implements Serializable {

    private String userId;

    @Enumerated(EnumType.STRING)
    private Role roleName;
}
