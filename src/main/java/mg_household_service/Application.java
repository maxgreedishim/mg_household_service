package mg_household_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableConfigurationProperties
@ComponentScan("mg_household_service.*")
@EntityScan("mg_household_service.*")
@EnableJpaRepositories("mg_household_service.*")

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}