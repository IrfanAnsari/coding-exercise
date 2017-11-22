package com.inmarsat.bdd.controller;

import com.inmarsat.bdd.model.Version;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @GetMapping(value={"/version"}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Version getVersion() {
        return new Version("1.0");
    }
}
