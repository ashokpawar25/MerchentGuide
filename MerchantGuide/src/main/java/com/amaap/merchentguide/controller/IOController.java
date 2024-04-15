package com.amaap.merchentguide.controller;

import com.amaap.merchentguide.service.IOService;

public class IOController {
    IOService ioService ;
    public IOController(IOService ioService) {
        this.ioService = ioService;
    }

    public boolean readFile(String filePath) {
        return ioService.readFile(filePath);
    }
}