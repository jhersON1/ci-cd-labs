package com.cicd.webapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class WebapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebapiApplication.class, args);
	}

}

@RestController
class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello CI/CD World!";
    }
}

@RestController
class HealthController {
    @GetMapping("/health")
    public String health() {
        return "Server Healthy!";
    }
}

@RestController
class DateController {
    @GetMapping("/date")
    public String date() {
        return "Current Server Date: " + java.time.LocalDate.now();
    }
}