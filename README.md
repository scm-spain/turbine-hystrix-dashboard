# Schibsted Spain Turbine and Hystrix Dashboard
Expose a Hystrix Dashboard and Turbine Stream. 

## Getting Started
Install the application:

```bash
$ ./gradle clean installDist
```

Launch the main application:

```bash
$ export CLOUD_EUREKA="http://urltoeureka:8080/eureka/v2/"; \
  export SERVICES="ms1,ms2,ms3,ms4,..."; \
  ./build/install/turbine/bin/turbine com.scmspain.turbine.Application
```
* **CLOUD_EUREKA**: The URL to Eureka service discovery.
* **SERVICES**: Services to monitor separated by comma.

Once the application is running, you can check: 

* **Hystrix Dashboard**: http://localhost:8080/hystrix
* **Turbine Stream**: http://localhost:8080/turbine.stream