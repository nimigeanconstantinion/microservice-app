package com.example.server.service;

import com.example.server.intercom.Command.CommandAdapter;
import org.springframework.stereotype.Service;

@Service
public class CommandService {

    private CommandAdapter commandAdapter;


    public CommandService(CommandAdapter commandAdapter) {
        this.commandAdapter = commandAdapter;
    }

}
