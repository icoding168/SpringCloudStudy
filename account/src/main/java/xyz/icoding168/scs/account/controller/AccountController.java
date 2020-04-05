package xyz.icoding168.scs.account.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.icoding168.scs.account.openfeign.AccountFeignClient;
import xyz.icoding168.scs.account.service.AccountService;

@RequestMapping("account")
@RestController
public class AccountController {


    @Value("${msg:Hello world - Config Server is not working..pelase check}")
    private String msg;

    @Autowired
    private AccountService accountService;

    @Autowired
    private AccountFeignClient accountFeignClient;

    @RequestMapping("test")
    public Object test(){

        return accountService.test();

    }

    @RequestMapping("testFeign")
    public Object testFeign(){

        return accountFeignClient.testFeign("John");

    }

    @RequestMapping("testHystrix")
    @HystrixCommand(fallbackMethod = "getNameFallback")
    public Object testHystrix(String username) throws Exception{
        if(username.equals("john")){
            return "this is John";
        }else{
            throw new Exception();
        }
    }

    public String getNameFallback(String username){
        return " this username is not exist ";
    }
}
