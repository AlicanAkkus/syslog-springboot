package com.aakkus.syslog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SyslogApplication {

    public static void main(String[] args) {
        SpringApplication.run(SyslogApplication.class, args);
    }

}

@RestController
class GreetingController {

    private final Logger logger = LoggerFactory.getLogger(GreetingController.class);

    @GetMapping
    public String hello(@RequestParam("n") String name) {
        logger.info("Say hello to {}", name);
        return "Hello " + name;
    }
}