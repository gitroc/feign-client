package com.example.feignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private CityClient cityClient;

    @Autowired
    private CompanyClient companyClient;

    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.GET)
    public String findOneCity(@PathVariable("id") int id) {
        return cityClient.findOneCity(id);
    }

    @RequestMapping(value = "/api/company", method = RequestMethod.GET)
    public Object findAll() {
        return companyClient.findAll();
    }
}
