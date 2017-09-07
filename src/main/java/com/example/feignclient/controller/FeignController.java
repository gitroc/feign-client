package com.example.feignclient.controller;

import com.example.feignclient.service.CompanyClient;
import com.example.feignclient.service.LoanClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class FeignController {

    @Autowired
    private CompanyClient companyClient;

    @Autowired
    private LoanClient loanClient;

    @RequestMapping(value = "/company/{id}", method = RequestMethod.GET)
    public Object findOne(@PathVariable("id") int id) {
        return companyClient.findOne(id);
    }

    @RequestMapping(value = "/company", method = RequestMethod.GET)
    public Object findList(@RequestParam(value = "page", required = false, defaultValue = "0") int page,
                           @RequestParam(value = "size", required = false, defaultValue = "10") int size,
                           @RequestParam(value = "updateTime", required = false, defaultValue = "") String updateTime) {
        return companyClient.findList(page, size, updateTime);
    }

    @RequestMapping(value = "/loan/{id}", method = RequestMethod.GET)
    public Object findOne(@PathVariable("id") long id) {
        return loanClient.findOne(id);
    }

    @RequestMapping(value = "/loan", method = RequestMethod.GET)
    public Object findList(@RequestParam(value = "page", required = false, defaultValue = "0") int page,
                           @RequestParam(value = "size", required = false, defaultValue = "10") int size,
                           @RequestParam(value = "loanLimit", required = false, defaultValue = "0") long loanLimit) {
        return loanClient.findList(page, size, loanLimit);
    }
}
