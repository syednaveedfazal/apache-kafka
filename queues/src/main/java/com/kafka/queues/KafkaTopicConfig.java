package com.kafka.queues;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic createTopic()
    {
        return new NewTopic("topic-from-method",3,(short)1);
    }
}
