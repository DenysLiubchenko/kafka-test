package io.test.kafkatest.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @KafkaListener(topics = "message-topic", groupId = "message_group")
    public void printMessage(String message) {
        System.out.println("New message: " + message);
    }
}
