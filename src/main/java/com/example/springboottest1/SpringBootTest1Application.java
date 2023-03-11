package com.example.springboottest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringBootTest1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTest1Application.class, args);
    }
}
