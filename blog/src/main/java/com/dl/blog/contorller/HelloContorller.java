package com.dl.blog.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContorller {

    @GetMapping("/hello")
    public String helloWorld(@RequestParam(value = "name",defaultValue = "world")String name){
        return "hello,"+name;
    }
}
