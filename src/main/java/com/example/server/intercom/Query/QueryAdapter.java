package com.example.server.intercom.Query;

import com.example.server.model.MapStocOpt;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class QueryAdapter {
    QueryClient queryClient;

    public List<MapStocOpt> queryAllMap(){
        List<MapStocOpt> lista=new ArrayList<>();
        lista=queryClient.queryAll();
        if(lista!=null&&lista.size()>0){
            return lista;
        }
        throw new RuntimeException("Nu am gasit mapari de stoc optim");
    }

}
