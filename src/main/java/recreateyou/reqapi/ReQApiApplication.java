package recreateyou.reqapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//exclude 부분은 임시로 비활성화 시킨 것이기 때문에 기능 구현후 삭제 필요.(MariaDB 연결, spring security)
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, SecurityAutoConfiguration.class})
public class ReQApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReQApiApplication.class, args);
	}

}
