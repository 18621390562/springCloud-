package com.example.democonsume.remoteapi;

import com.example.democonsume.remoteapi.fallback.ProductApiFB;
import org.json.simple.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "http://127.0.0.1",path="/mall-system-api/",fallback = ProductApiFB.class)
public interface MallApi {

    @GetMapping("user/getPermissionTree")
    JSONObject getPermissionTree(@RequestParam("resourceType") Integer resourceType);
}
