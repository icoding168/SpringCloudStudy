package xyz.icoding168.scs.account.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.icoding168.scs.account.service.AccountService;

@RequestMapping("account")
@RestController
public class AccountController {


    @Value("${msg:Hello world - Config Server is not working..pelase check}")
    private String msg;

    @Autowired
    private AccountService accountService;

    @RequestMapping("test")
    public Object test(){

        return accountService.test();

    }
}
