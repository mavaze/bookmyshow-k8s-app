package io.github.mavaze.bookmyshow;

import org.springdoc.core.properties.SwaggerUiConfigParameters;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
// @@EnableAdminServer
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner openApiGroups(
            DiscoveryClient discovery, SwaggerUiConfigParameters swaggerUiParameters) {
        return args -> discovery.getServices()
                .stream()
                .filter(id -> id.matches(".*-api"))
                .map(id -> id.replace("-api", ""))
                .forEach(swaggerUiParameters::addGroup);
    }
}
