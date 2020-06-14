package com.seckill.uniqueid.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "uniqueid",fallback = IdGeneratorClient.UniqueIdFallBack.class)
public interface IdGeneratorClient {
    @GetMapping("/getuniqueid")
    String getUniqueId();
    @Component
    static class UniqueIdFallBack implements IdGeneratorClient{
        @Override
        public String getUniqueId() {
            return null;
        }
    }
}
