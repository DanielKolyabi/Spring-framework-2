package ro.shum.Spring2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Spring2Application {

	public static void main(String[] args) {

		SpringApplication.run(Spring2Application.class, args);
	}
	@RestController
	class HelloController {
		@GetMapping("/hello")
		public String hello() {
			return "Добро пожаловать на главную страницу!";
		}
	}
}

