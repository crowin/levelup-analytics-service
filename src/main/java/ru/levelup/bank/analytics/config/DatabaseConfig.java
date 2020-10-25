package ru.levelup.bank.analytics.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    private final DatabaseProperties dbProps;

    @Autowired
    public DatabaseConfig(DatabaseProperties dbProps) {
        this.dbProps = dbProps;
    }

    @Bean
    @Primary
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.postgresql.Driver");
        dataSourceBuilder.url(dbProps.getUrl());
        dataSourceBuilder.username(dbProps.getUsername());
        dataSourceBuilder.password(dbProps.getPassword());
        return dataSourceBuilder.build();
    }
}
