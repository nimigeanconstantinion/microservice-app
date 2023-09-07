package com.example.server.intercom.Command;

import com.example.server.model.MapStocOpt;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CommandAdapter {
    CommandClient commandClient;

    public MapStocOpt addMap(MapStocOpt addM){
        commandClient.addMap(addM);
        MapStocOpt addedM=commandClient.getMapByIDp(addM.getIdIntern());
        if(addedM.getClass().equals("MapStocOpt")){
            return addedM;
        }
        throw new RuntimeException("Eroare add din Adapter");

    }
}
