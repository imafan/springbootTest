package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by imafan on 2017-08-22.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String say(){
        System.out.println("say");
        return "say";
    }
}
