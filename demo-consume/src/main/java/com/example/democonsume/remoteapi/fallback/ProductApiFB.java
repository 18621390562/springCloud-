package com.example.democonsume.remoteapi.fallback;

import com.example.democonsume.remoteapi.ProductApi;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("fallback")
public class ProductApiFB implements ProductApi {
    @Override
    public JSONObject productHello(String name) {
        JSONObject result = new JSONObject();
        result.put("error","服务不存在");
        return result;
    }
}
