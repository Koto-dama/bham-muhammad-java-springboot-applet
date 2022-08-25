package projects.java.administrators;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class adminConfig {

    @Bean
    CommandLineRunner adminLineRunner(adminRepository repository){
        return args -> {
            admin sampleEntry = new admin(
                    1L,"Johan jonas",
                    "32154",
                    "0115116564");

            repository.save(sampleEntry);
        };
    }
}
