package stewart.jonathan.DataJPA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;



@Configuration
public class DataJPAConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepo studentRepo) {
        return args -> {
            Student no1 = new Student(
                    "Jin",
                    "Sakai",
                    "jin.sakai@yahoo.com",
                    29
            );
            Student no2 = new Student(
                    "Isshin",
                    "Asuna",
                    "ishi.a@samurai.com",
                    56
            );
            studentRepo.saveAll(List.of(no1, no2));
        };
    }
}

