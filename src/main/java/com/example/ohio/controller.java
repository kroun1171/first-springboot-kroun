package com.example.ohio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class controller {

    @GetMapping("/ui")
    public String ui(){
        return "hello";
    }
    @GetMapping("/greet")
    public String greet(){
        return "hello i am greeting you";
    }
}
