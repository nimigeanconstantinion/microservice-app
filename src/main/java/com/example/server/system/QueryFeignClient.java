package com.example.server.system;

import com.example.server.model.MapStocOpt;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "query-srvice",url = "https://localhost/api/v1/query")
public interface QueryFeignClient {

    @GetMapping("/query")
    List<MapStocOpt> queryAll();
}
