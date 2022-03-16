package com.benhadley;

import com.benhadley.entity.ThemeParkRide;
import com.benhadley.repository.ThemeParkRideRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ThemeParkApplication {
    public static void main(String[] args) {
        SpringApplication.run(ThemeParkApplication.class);
    }

    @Bean
    public CommandLineRunner sampleData(ThemeParkRideRepository repository) {
        return (args) -> {
            repository.save(new ThemeParkRide("Roller coaster", "Train ride that drives you round the bend", 5, 3));
            repository.save(new ThemeParkRide("Pirate ship", "Don't throw up on the person in front", 4, 5));
            repository.save(new ThemeParkRide("Bumper cars", "Practice your driving skills", 4, 2));
        };
    }
}
