package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by imafan on 2017-08-22.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello/say")
    @ResponseBody
    public String say(HttpSession session){
        System.out.println("say  111");

        session.setAttribute("session_test", "sssssss");

        return "say 111";
    }

    @RequestMapping("/hello")
    public String hello(Map<String,Object> map,HttpSession session) throws Exception{
        map.put("name", "[Angel -- 守护天使]");
        map.put("session",session.getAttribute("session_test"));
        return "hello";
    }


}
