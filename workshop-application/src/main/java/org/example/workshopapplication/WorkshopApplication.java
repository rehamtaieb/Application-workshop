package org.example.workshopapplication;

import org.example.workshopapplication.entities.Product;
import org.example.workshopapplication.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class WorkshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkshopApplication.class, args);
    }
    // Test MySQL connection at startup
    @Bean
    CommandLineRunner testMySQL(JdbcTemplate jdbcTemplate) {
        return args -> {
            try {
                String dbName = jdbcTemplate.queryForObject("SELECT DATABASE()", String.class);
                System.out.println("✅ Connected to MySQL successfully! Current database: " + dbName);
            } catch (Exception e) {
                System.err.println("❌ Failed to connect to MySQL: " + e.getMessage());
            }

        };
    }

}
