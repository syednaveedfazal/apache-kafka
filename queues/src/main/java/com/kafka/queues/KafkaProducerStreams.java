package com.kafka.queues;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
public class KafkaProducerStreams {

    @Bean
    public Supplier<Location> sendRiderLocation() {
        return () -> {
            Location location = new Location("syed", "12121.12", "12122.1");
            System.out.println("sending   " + location.toString());
            return location;
        };
    }
}
