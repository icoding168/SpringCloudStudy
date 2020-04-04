package xyz.icoding168.scs.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;

@Service
public class AccountService {

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public Object test() {
        try{
            RequestEntity requestEntity = new RequestEntity(HttpMethod.GET,new URI("http://blog/blog/test"));

            HashMap body = restTemplate.exchange(requestEntity, HashMap.class).getBody();

            System.out.println(body.toString());

            return body;
        }catch(Exception e){
            e.printStackTrace();
        }

        return "none";
    }

}
