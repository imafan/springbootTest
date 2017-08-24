package com.example.demo;

import com.example.exception.RestFullException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by imafan on 2017-08-24.
 */
@Controller
public class ExceptionController {

    @RequestMapping("/ex1")
    public String hello() throws Exception{
        throw new Exception("发生错误");
    }

    @RequestMapping("/ex2")
    public String hello2() throws Exception{
        throw new RestFullException("发生错误");
    }
}
