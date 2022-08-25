package projects.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import projects.java.students.Student;

@SpringBootApplication
public class Prg381ProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(Prg381ProjectApplication.class, args);
	}

}
