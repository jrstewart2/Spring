package uk.co.nationwide.stewart.jonathan.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
    @Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("mysql://localhost:3306/conference_demo");
        System.out.println("Custom datasource bean initialized and set");
        return builder.build();
    }
}
