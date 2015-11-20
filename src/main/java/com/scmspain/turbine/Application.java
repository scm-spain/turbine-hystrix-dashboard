package com.scmspain.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableHystrixDashboard
@EnableTurbine
@ComponentScan
public class Application {
  public static void main(String[] args) {
//    SpringApplication.run(Application.class, args);
    new SpringApplicationBuilder(Application.class).web(true).run(args);
  }
}
