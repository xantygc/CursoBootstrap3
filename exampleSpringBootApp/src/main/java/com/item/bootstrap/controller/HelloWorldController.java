package com.item.bootstrap.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by santy on 15/04/16.
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String helloWorld()
    {
        return "****************  Hello World  ************************";
    }
}
