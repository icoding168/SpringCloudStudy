package xyz.icoding168.scs.blog.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("blog")
@RestController
public class BlogController {


    @Value("${msg:Hello world - Config Server is not working..pelase check}")
    private String msg;



    @RequestMapping("test")
    public Object test(){
        Map map = new HashMap<>();
        map.put("msg",msg);

        return map;

    }

    @RequestMapping("testFeign")
    public Object testFeign(String username){
        Map map = new HashMap<>();

        map.put("username",username);

        return map;

    }

}
