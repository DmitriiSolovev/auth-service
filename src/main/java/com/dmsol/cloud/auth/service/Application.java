package com.dmsol.cloud.auth.service;

import com.dmsol.cloud.auth.service.model.Role;
import com.dmsol.cloud.auth.service.model.User;
import com.dmsol.cloud.auth.service.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by Dima on 09.05.2017.
 */

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner insertUserData(UserRepository userRepository) {
        return (args) -> {
            User user = new User("user", "user", Role.USER);
            User admin = new User("admin", "admin", Role.ADMIN);

            userRepository.save(user);
            userRepository.save(admin);
        };
    }
}
