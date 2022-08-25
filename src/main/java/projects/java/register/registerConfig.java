package projects.java.register;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class registerConfig {

    @Bean
    CommandLineRunner regLineRunner(registerRepository repository){
        return args -> {
            Register newReg = new Register(
                    1L,
                    "sampleName",
                    "420 long street",
                    "e@mail.com",
                    "password123",
                    "Bachelor's of Chemical Engineering");

            repository.save(newReg);
        };
    }
}
