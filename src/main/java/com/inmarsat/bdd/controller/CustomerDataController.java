package com.inmarsat.bdd.controller;

import com.inmarsat.bdd.model.Widget;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerDataController {

    @GetMapping(value = "/entity",produces = {MediaType.APPLICATION_JSON_VALUE})
    public Widget index() {
        return new Widget("green", 10, 7);
    }
}
