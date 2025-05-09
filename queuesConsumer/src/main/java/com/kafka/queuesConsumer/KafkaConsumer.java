package com.kafka.queuesConsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    @KafkaListener(topics = "my-topic", groupId = "my-new-group")
    public void listen(Location message) {
        System.out.println("Received"+message.getLatitute()+message.getLongitute());
    }
}
