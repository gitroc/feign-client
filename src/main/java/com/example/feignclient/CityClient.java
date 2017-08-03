package com.example.feignclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-song", fallback = CityClientHystrix.class)
public interface CityClient {
    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.GET)
    String findOneCity(@PathVariable("id") int id);
}
