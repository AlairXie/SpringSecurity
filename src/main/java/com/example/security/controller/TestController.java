package com.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xieyunpeng
 * @Date 2024/1/15 9:51
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "Spring Security!!";
    }

//    @GetMapping("/index")
//    public String index(){
//        return "hello index!!";
//    }

    @GetMapping("index")
    public String index(){
        return "login";
    }

    @GetMapping("findAll")
    @ResponseBody
    public String findAll() {
        return "findAll";
    }


}
