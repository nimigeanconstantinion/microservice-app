package com.example.server.controller;


import com.example.server.model.MapStocOpt;
import com.example.server.service.CommandService;
import com.example.server.service.QueryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/server")
@CrossOrigin
@AllArgsConstructor
public class ServerController {
    private QueryService queryService;
    private CommandService commandService;

//    @ResponseStatus(HttpStatus.OK)
//    @GetMapping("")
//    public List<MapStocOpt> queryAllMaps(){
//       try {
//           return queryService.readAllMap();
//       }catch (RuntimeException e){
//           throw e;
//       }
//    }
}
