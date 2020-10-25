package ru.levelup.bank.analytics.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:postgres.properties")
@ConfigurationProperties("db")
@Data
public class DatabaseProperties {
    private String url;
    private String username;
    private String password;
}
