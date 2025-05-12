package com.kafka.queuesConsumer;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class KafkaConsumerStreams {

    @Bean
    public Consumer<Location> consumeLocation()
    {
        return location ->
        {
            System.out.println(location.getArea()+"  received");
        };
    }
}
