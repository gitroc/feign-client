package com.example.feignclient;

import org.springframework.stereotype.Component;

@Component
public class CityClientHystrix implements CityClient{
    @Override
    public String findOneCity(int id) {
        return "Feign CityClientHystrix Error id = " + id;
    }
}
