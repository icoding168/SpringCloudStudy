package xyz.icoding168.scs.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClient3 {

    public static void main(String[] args){
        SpringApplication.run(EurekaClient3.class, args);
    }
}
