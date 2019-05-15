package com.org.controllers;


import com.org.model.Version;
import com.org.services.VersionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.web.bind.annotation.RestController
@Slf4j
public class MyRestController {

    @Autowired
    VersionService versionService;


    @RequestMapping(value = "/version", method = RequestMethod.GET, produces = "application/json")
    public Version test() {
        log.debug("test ");
        return versionService.getVersion();


    }


}
