package com.sparta.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api") // 이걸 달면 앞쪽 겹치는 api 주소 생략 가능
public class HelloControler {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }

    // 같은 api 경로라도 요청이 다르면 ㄱㅊ
    // 메서드까지는 중복이 불가
    @PostMapping("/hello")
    @ResponseBody
    public String postHello(){
        return "get hello";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get (){
        return "GET Method 요청";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post(){
        return "POST Method 요청";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put(){
        return "PUT 요청";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete(){
        return "DELETE Method 요청";
    }







}
