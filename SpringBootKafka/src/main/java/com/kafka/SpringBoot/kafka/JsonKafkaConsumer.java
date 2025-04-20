package com.kafka.SpringBoot.kafka;

import com.kafka.SpringBoot.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
   private static final Logger logger = LoggerFactory.getLogger(JsonKafkaConsumer.class);

   @KafkaListener(topics = "Demo-Kafka-TopicName_json", groupId = "myGroup")
    public void consume(User user){
       logger.info(String.format("Json message rreceived -->%s", user.toString()));

   }

}