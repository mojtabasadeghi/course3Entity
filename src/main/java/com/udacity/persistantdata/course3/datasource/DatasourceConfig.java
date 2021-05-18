package com.udacity.persistantdata.course3.datasource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfig {

    @Bean
    public  DataSource getDatasource()
    {
        DataSourceBuilder dsb =DataSourceBuilder.create();
        dsb.username("sa");
        dsb.password(securePasswordService());
        dsb.url("jdbc:mysql://localhost:3306/plant");
        return dsb.build();
    }

    private  String securePasswordService() {
        return "sa1234";
    }
}
