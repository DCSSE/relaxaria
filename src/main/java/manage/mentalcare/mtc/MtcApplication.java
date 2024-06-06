package manage.mentalcare.mtc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("manage.mentalcare.mtc.repository")
public class MtcApplication {

	public static void main(String[] args) {
		SpringApplication.run(MtcApplication.class, args);
	}

}
