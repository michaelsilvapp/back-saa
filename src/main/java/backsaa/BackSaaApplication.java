package backsaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import backsaa.service.AlunoService;

@SpringBootApplication
@ComponentScan("backsaa")
@EntityScan("backsaa.entity")
@EnableJpaRepositories(basePackages = {"backsaa.repository"})
public class BackSaaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackSaaApplication.class, args);
		
		
	}
	
}
