package com.example.demo.com.exmple.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PrintController {

    @GetMapping(path="/message/{name}")
    public String getMessage(@PathVariable("name") String commitId){
        return commitId;
    }
}
