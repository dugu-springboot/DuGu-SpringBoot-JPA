package me.xueyao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "me.xueyao.repository")
@SpringBootApplication
public class DuGuSpringBootJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DuGuSpringBootJpaApplication.class, args);
    }

}
