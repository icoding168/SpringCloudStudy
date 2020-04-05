package xyz.icoding168.scs.account.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("blog")
@RequestMapping(path = "/blog")
public interface AccountFeignClient {

    @RequestMapping("testFeign")
    Object testFeign(@RequestParam String username);

}
