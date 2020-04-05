package xyz.icoding168.scs.eureka.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "backend")
@RequestMapping("provider")
public interface FeignInterface {

    @RequestMapping(value = "testFeign")
    Object testFeign(@RequestParam String username);
}
