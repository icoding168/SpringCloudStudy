package xyz.icoding168.scs.eureka.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("consumer")
@RestController
public class ConsumerController {


    @Autowired
    RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RequestMapping("test")
    public Object test(){
        try{
            RequestEntity requestEntity = new RequestEntity(HttpMethod.GET,new URI("http://backend/provider/test"));

            HashMap body = restTemplate.exchange(requestEntity, HashMap.class).getBody();

            System.out.println(body.toString());

            return body;
        }catch(Exception e){
            e.printStackTrace();
        }

        return new HashMap<>();

    }


}
