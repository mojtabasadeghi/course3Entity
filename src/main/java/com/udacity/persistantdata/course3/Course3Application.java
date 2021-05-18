package com.udacity.persistantdata.course3;

import com.udacity.persistantdata.course3.datasource.DynamicDataSourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;

import javax.sql.DataSource;

@SpringBootApplication
public class Course3Application {



	public static void main(String[] args) {

		SpringApplication.run(Course3Application.class, args);

	}

}
