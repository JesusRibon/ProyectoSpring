package com.example.springfrancisco.infrastructure.event.publish;

import java.nio.charset.StandardCharsets;
import lombok.AllArgsConstructor;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class Publisher {

  private final RabbitTemplate rabbitTemplate;

  public void sendMessage(String message) {
    rabbitTemplate.send(MessageBuilder.withBody(message.getBytes(StandardCharsets.UTF_8)).build());
  }

}