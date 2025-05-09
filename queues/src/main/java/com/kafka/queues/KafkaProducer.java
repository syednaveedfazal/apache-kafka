package com.kafka.queues;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class KafkaProducer {

    private final KafkaTemplate<String,Location> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, Location> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/send")
    public String sendMessage(@RequestBody String message)
    {
        Location location = new Location("hyd","123","78.7");
        kafkaTemplate.send("my-topic",location);
        return "message sent : "+ location.getArea();
    }
}
