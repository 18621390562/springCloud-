package com.example.democonsume.remoteapi;

import com.example.democonsume.remoteapi.fallback.ProductApiFB;
import org.json.simple.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "demo-product",fallback = ProductApiFB.class)
public interface ProductApi {

    @GetMapping("hello")
    JSONObject productHello(@RequestParam("name") String name);
}
