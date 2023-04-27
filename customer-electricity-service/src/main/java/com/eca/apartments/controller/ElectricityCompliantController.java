package com.eca.apartments.controller;

import com.eca.apartments.configuration.CustomerConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElectricityCompliantController {

    @Autowired
    CustomerConfiguration configuration;

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return configuration.getMaximum();
    }
}
