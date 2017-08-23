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
    public String hello(Map<String,Object> map){
        map.put("name", "[Angel -- 守护天使]");
        return "hello";
    }

//    @RequestMapping(value="/users/", method= RequestMethod.GET)
//    public List<User> getUserList() {
//        // 处理"/users/"的GET请求，用来获取用户列表
//        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
//        List<User> r = new ArrayList<User>(UserController.users.values());
//        return r;
//    }
}
