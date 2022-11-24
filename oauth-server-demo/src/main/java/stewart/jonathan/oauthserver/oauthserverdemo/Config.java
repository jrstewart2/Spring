package stewart.jonathan.oauthserver.oauthserverdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import stewart.jonathan.oauthserver.oauthserverdemo.model.AppUser;
import stewart.jonathan.oauthserver.oauthserverdemo.model.Role;
import stewart.jonathan.oauthserver.oauthserverdemo.service.UserService;

import java.util.ArrayList;


@Configuration
public class Config {

    @Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
            userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_MANAGER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));
            userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

            userService.saveUser(new AppUser(null, "John Travolta", "john", "1234", new ArrayList<>()));
            userService.saveUser(new AppUser(null, "Leonardo Di Caprio", "leo", "5678", new ArrayList<>()));
            userService.saveUser(new AppUser(null, "Tom Hardy", "tom", "9123", new ArrayList<>()));
            userService.saveUser(new AppUser(null, "Christian Bale", "christian", "4567", new ArrayList<>()));

            userService.addRoleToUser("john", "ROLE_USER");
            userService.addRoleToUser("leo", "ROLE_USER");
            userService.addRoleToUser("tom", "ROLE_USER");
            userService.addRoleToUser("christian", "ROLE_USER");
            userService.addRoleToUser("leo", "ROLE_MANAGER");
            userService.addRoleToUser("tom", "ROLE_MANAGER");
            userService.addRoleToUser("christian", "ROLE_MANAGER");
            userService.addRoleToUser("leo", "ROLE_ADMIN");
            userService.addRoleToUser("tom", "ROLE_ADMIN");
            userService.addRoleToUser("tom", "ROLE_SUPER_ADMIN");
        };
    }
}