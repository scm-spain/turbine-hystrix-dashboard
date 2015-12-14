# Schibsted Spain Turbine and Hystrix Dashboard
Expose a Hystrix Dashboard and Turbine Stream. 

## Getting Started
Install the application:

```bash
$ ./gradlew clean installDist
```

Launch the main application:

```bash
$ export CLOUD_EUREKA="http://urltoeureka:8080/eureka/v2/"; \
  export SERVICES="ms1,ms2,ms3,ms4,..."; \
  ./build/install/turbine/bin/turbine com.scmspain.turbine.Application
```

Or you can run it using [our public Docker image](https://hub.docker.com/r/schibstedspain/turbine-hystrix-dashboard):

```bash
$ export CLOUD_EUREKA="http://urltoeureka:8080/eureka/v2/"; \
  export SERVICES="ms1,ms2,ms3,ms4,..."; \
  docker run -d --name turbine-hystrix-dashboard -e "CLOUD_EUREKA=$CLOUD_EUREKA" -e "SERVICES=$SERVICES" -p 8080:8080 schibstedspain/turbine-hystrix-dashboard
```

* **CLOUD_EUREKA**: The URL to Eureka service discovery.
* **SERVICES**: Services to monitor separated by comma.

Once the application is running, you can check:

* **Hystrix Dashboard**: http://localhost:8080/hystrix
* **Turbine Stream**: http://localhost:8080/turbine.stream

If you started the app using docker, change localhost with the IP of your docker machine.

## Development
If you change anything from the repository, remember to re-publish [the Docker image](https://hub.docker.com/r/schibstedspain/turbine-hystrix-dashboard/) using a CI server like Jenkins or Travis.