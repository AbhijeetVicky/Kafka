package com.kafka.SpringBoot.controller;

import com.kafka.SpringBoot.dto.User;
import com.kafka.SpringBoot.kafka.JsonKafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessagewController {

    private final JsonKafkaProducer jsonKafkaProducer;
    public JsonMessagewController(JsonKafkaProducer jsonKafkaProducer) {
        this.jsonKafkaProducer = jsonKafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
        jsonKafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json Sent to Kafka Topic");
    }
}
