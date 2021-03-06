package com.nhn.rookie8.sample.account;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Controller
public class HelloWorldController {
    @Value("${application.message:Hello World}")
    private String message = "Hello Rookie!";

    @GetMapping("/helloworld")
    @ResponseBody
    public String helloWorld() {
        return "Hello World!!!!!!!!!!!!!!";
    }
}