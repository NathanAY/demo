package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by minsk on 7/9/2017.
 */
@Controller
public class SecondaryController {

    @GetMapping({"/test","/test2" })
    public String test(){
        return "test";
    }

    @GetMapping("/test3")
    public String test2(){
        return "test2";
    }
}
