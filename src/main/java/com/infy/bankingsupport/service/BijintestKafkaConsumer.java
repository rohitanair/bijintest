package com.infy.bankingsupport.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class BijintestKafkaConsumer {

    private final Logger log = LoggerFactory.getLogger(BijintestKafkaConsumer.class);
    private static final String TOPIC = "topic_bijintest";

    @KafkaListener(topics = "topic_bijintest", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info("Consumed message in {} : {}", TOPIC, message);
    }
}
