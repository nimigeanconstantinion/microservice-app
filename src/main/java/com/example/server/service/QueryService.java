package com.example.server.service;


import com.example.server.intercom.Query.QueryAdapter;
import com.example.server.model.MapStocOpt;
import com.example.server.system.QueryFeignClient;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class QueryService {

    private QueryAdapter queryAdapter;

    public List<MapStocOpt> readAllMap(){
            return queryAdapter.queryAllMap();
    }
}
