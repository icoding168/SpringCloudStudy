package xyz.icoding168.scs.blog.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("blog")
@RestController
public class BlogController {


    @Value("${msg:Hello world - Config Server is not working..pelase check}")
    private String msg;

    @RequestMapping("test")
    public Object test(){

        return msg;

    }
}
