package com.example.server.controller;


import com.example.server.model.MapStocOpt;
import com.example.server.service.QueryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/server")
@CrossOrigin

public class ServerController {
    private QueryService queryService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("")
    public List<MapStocOpt> queryAllMaps(){
       try {
           return queryService.readAllMap();
       }catch (RuntimeException e){
           throw e;
       }
    }
}
