package recreateyou.reqapi.auth.entity;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import recreateyou.reqapi.auth.enums.Role;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("unused")
public class AuthCompositeId implements Serializable {

    private String userId;

    @Enumerated(EnumType.STRING)
    private Role roleName;
}
