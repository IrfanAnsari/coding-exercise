package com.inmarsat.bdd.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenericErrorController implements ErrorController{

    private static final String PATH = "/error";


    @GetMapping(value=PATH)
    public String error() {
        return "Error heaven";
    }


    @Override
    public String getErrorPath() {
        return PATH;
    }
}
