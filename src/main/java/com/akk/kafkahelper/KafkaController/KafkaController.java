package com.akk.kafkahelper.KafkaController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    @GetMapping(path = "/hellokafka")
    public String helloKafka(){
        return "Hello from Kafka Controller";
    }
}
