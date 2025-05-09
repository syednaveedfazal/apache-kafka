package com.kafka.queues;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class CloudFunctions {
    @Bean
    public Function<String,String> upperCase()
    {
        return value->value.toUpperCase();
    }
}
