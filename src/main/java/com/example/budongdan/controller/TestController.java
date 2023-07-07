package com.example.budongdan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {

    @GetMapping("/")
    public String index(){

        return "index.html";
    }

    @GetMapping("/students")
    @ResponseBody
    public Object students(){
        List<Map> result = new ArrayList<>();
        Map map = new HashMap();
        map.put("name","김종민");
        map.put("age",40);
        result.add(map);

        Map map1 = new HashMap();
        map1.put("name","김종윤");
        map1.put("age",37);
        result.add(map1);
        System.out.println("students call~~~~~~~~~~~~~~");
        return result;
    }
}
