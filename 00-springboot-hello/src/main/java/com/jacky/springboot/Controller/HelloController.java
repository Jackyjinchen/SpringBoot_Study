package com.jacky.springboot.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Value("${jdbc.name}")
    private String name;

    @RequestMapping("/boot/hello")
    public @ResponseBody String hello(){

        return name+"Hello Spring Boot!";
    }
}
