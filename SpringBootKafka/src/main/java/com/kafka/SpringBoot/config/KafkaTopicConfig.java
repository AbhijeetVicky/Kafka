package com.kafka.SpringBoot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic createKafkaTopic(){
        return TopicBuilder.name("Demo-Kafka-TopicName")
                //.partitions(3)
                //.replicas(1)
                .build();
    }
}
