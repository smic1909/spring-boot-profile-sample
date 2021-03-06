package de.itblogging.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("production")
public class HelloProductionProfile {

    @Bean(name = "environment")
    public String getEnvironment() {
        return "production";
    }
}
