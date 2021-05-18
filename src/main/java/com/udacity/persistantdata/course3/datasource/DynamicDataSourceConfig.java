package com.udacity.persistantdata.course3.datasource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DynamicDataSourceConfig {

    @Bean
    @ConfigurationProperties(prefix = "dynamic.datasource")
    public DataSource getDataSource()
    {
        DataSourceBuilder dsb=DataSourceBuilder.create();
        dsb.url("jdbc:mysql://localhost:3306/plant?serverTimezone=UTC");
        return dsb.build();
    }
}
