package com.example.democonsume.controller;

import com.example.democonsume.remoteapi.MallApi;
import com.example.democonsume.remoteapi.ProductApi;
import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET})
@Slf4j
public class DemoController {

    @Autowired
    private ProductApi productApi;
    @Autowired
    private MallApi mallApi;

    @GetMapping("hello")
    public JSONObject hello(@RequestParam("name") String name) {
//        log.info("consume print out");
        return productApi.productHello(name);
    }
    @GetMapping("getPermissionTree")
    public JSONObject getPermissionTree(@RequestParam("name") Integer type) {
    	return mallApi.getPermissionTree(type);
    }
}
