package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by imafan on 2017-08-22.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello/say")
    @ResponseBody
    public String say(){
        System.out.println("say  111");
        return "say 111";
    }

    @RequestMapping("/hello")
    public String hello(Map<String,Object> map) throws Exception{
        map.put("name", "[Angel -- 守护天使]");

        return "hello";
    }


}
