package com.example.controller;

import com.example.rabbitmq.Send;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by imafan on 2017-09-11.
 */
@RestController
public class RabbitmqController {

    @Autowired
    private Send sender;

    @GetMapping("/rabbitmq/send")
    public String send(HttpServletRequest request, String msg) {
        sender.sendMsg(msg);
        return "Send OK.";
    }
}