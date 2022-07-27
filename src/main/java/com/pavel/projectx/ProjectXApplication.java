package com.pavel.projectx;

import com.pavel.projectx.component.GreetingClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class ProjectXApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ProjectXApplication.class, args);
        GreetingClient greetingClient = context.getBean(GreetingClient.class);

        log.warn(">> message = " + greetingClient.getMessage().block());
    }
}
