package com.example.feignclient.service;

import com.example.feignclient.service.impl.LoanClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "eureka-song", fallback = LoanClientHystrix.class)
public interface LoanClient {
    @RequestMapping(value = "/api/loan/{id}", method = RequestMethod.GET)
    Object findOne(@PathVariable("id") long id);

    @RequestMapping(value = "/api/loan", method = RequestMethod.GET)
    Object findList(@RequestParam(value = "page", required = false, defaultValue = "0") int page,
                    @RequestParam(value = "size", required = false, defaultValue = "10") int size,
                    @RequestParam(value = "loanLimit", required = false, defaultValue = "") long loanLimit);
}
