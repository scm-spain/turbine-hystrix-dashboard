package com.scmspain.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableHystrixDashboard
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
