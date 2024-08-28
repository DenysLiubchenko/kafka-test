package io.test.kafkatest.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MessageController {
    private final KafkaTemplate<String,String> kafkaTemplate;

    @PostMapping
    public void sendMessage(@RequestParam String message) {
        kafkaTemplate.send("message-topic", message);
    }
}
