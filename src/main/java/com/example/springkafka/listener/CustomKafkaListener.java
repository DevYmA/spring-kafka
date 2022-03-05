package com.example.springkafka.listener;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class CustomKafkaListener {

    @KafkaListener(
            topics = "track-event",
            groupId = "test-group"
    )
    void firstListener(String data){
        System.out.println("Data received : "+data);
    }
}
