package projects.java.students;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class studentConfig {

    @Bean
    CommandLineRunner lineRunner(studentRepository repository){
      return args -> {
          Student sample = new Student(
                  1L,
                  "newsampleName",
                  "sampleAddress",
                  "ssampleEmail@gmail.com",
                  "passwurd");

          repository.save(sample);
      };
    }
}
