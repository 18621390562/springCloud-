package com.example.demoproduct.controller;

import com.example.demoproduct.config.DemoConfig;
import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*",methods ={RequestMethod.GET})
@Slf4j
public class DemoController {

    @Autowired
    private DemoConfig demoConfig;

    @GetMapping("hello")
    public JSONObject hello(@RequestParam("name") String name){
        JSONObject result = new JSONObject();
        result.put("hello",String.format("hello %s i am %s",name,demoConfig.getServerName()));
//        log.info("product print out");
        return result;
    }
}
