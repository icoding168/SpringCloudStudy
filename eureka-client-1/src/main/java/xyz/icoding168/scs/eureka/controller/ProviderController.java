package xyz.icoding168.scs.eureka.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("provider")
@RestController
public class ProviderController {


    @RequestMapping("test")
    public Object test(){
        Map map = new HashMap<>();

        map.put("provider","EurekaClient1");

        return map;

    }


}
