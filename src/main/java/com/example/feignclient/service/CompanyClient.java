package com.example.feignclient.service;

import com.example.feignclient.service.impl.CompanyClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-song", fallback = CompanyClientHystrix.class)
public interface CompanyClient {
    @RequestMapping(value = "/api/company/{id}", method = RequestMethod.GET)
    Object findOne(@PathVariable("id") int id);

    @RequestMapping(value = "/api/company", method = RequestMethod.GET)
    Object findList(@RequestParam(value = "page", required = false, defaultValue = "0") int page,
                    @RequestParam(value = "size", required = false, defaultValue = "10") int size,
                    @RequestParam(value = "updateTime", required = false, defaultValue = "") String updateTime);
}
