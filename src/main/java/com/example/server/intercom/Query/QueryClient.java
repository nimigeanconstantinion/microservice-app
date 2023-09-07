package com.example.server.intercom.Query;

import com.example.server.model.MapStocOpt;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "query-service",url = "https://localhost:8082/api/v1/query")

public interface QueryClient {

    @GetMapping("/query")
    List<MapStocOpt> queryAll();

}
