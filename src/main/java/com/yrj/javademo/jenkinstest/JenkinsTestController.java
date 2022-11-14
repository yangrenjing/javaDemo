package com.yrj.javademo.jenkinstest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class JenkinsTestController {

    @RequestMapping("/test")
    public String test () {
        return "Hello Jenkins";
    }

}
