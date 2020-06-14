package com.seckill.uniqueid.server.controller;


import com.seckill.uniqueid.server.IdGenerator;
import com.seckill.uniqueid.server.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniqueIdController {
    @GetMapping("/getuniqueid")
    public String getUniqueId(){
        return String.valueOf(new IdGenerator().nextId());
    }
}
