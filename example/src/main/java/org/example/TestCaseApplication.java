package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author DDD
 * @date 2022/6/10 13:28
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TestCaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestCaseApplication.class, args);
    }
}
