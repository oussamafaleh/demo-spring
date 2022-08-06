package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyServiceController {

    @Autowired
    CurrencyServiceConfiguration configuration;


    @RequestMapping("/currency-service")
    public CurrencyServiceConfiguration getCurrencySerive(){
        return configuration;
    }
}
