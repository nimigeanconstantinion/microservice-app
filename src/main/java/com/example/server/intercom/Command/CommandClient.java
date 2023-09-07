package com.example.server.intercom.Command;

import com.example.server.model.MapStocOpt;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "command-service",url = "https://localhost:8081/api/v1/command")

public interface CommandClient {
    @PostMapping("/add")
    MapStocOpt addMap(MapStocOpt mapStocOpt);

    @GetMapping("/getbyidp/{idp}")
    MapStocOpt getMapByIDp(String idp);

}
