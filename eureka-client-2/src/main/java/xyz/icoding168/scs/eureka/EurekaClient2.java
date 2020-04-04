package xyz.icoding168.scs.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "ribbonClient", configuration = RibbonConfiguration.class)
public class EurekaClient2 {

    public static void main(String[] args){
        SpringApplication.run(EurekaClient2.class, args);
    }
}
