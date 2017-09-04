package com.example.feignclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-song", fallback = CompanyClientHystrix.class)
public interface CompanyClient {
    @RequestMapping(value = "/api/company", method = RequestMethod.GET)
    Object findAll();
}
