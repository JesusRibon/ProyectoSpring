package com.example.springfrancisco.infrastructure.event.listen;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.infrastructure.api.controller.CarController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@AllArgsConstructor
public class Receiver {
public static String RECEIVE_METHOD_NAME = "receiveMessage";
private final ObjectMapper objectMapper;
private final CarController carController;
public void receiveMessage(byte[] message)throws JsonProcessingException {
  String messageConvert = new String (message, StandardCharsets.UTF_8);
  Carro carro = objectMapper.readValue(messageConvert,Carro.class);
  log.info("Receive message [{}]",carro);
carController.deleteCar(carro.getPlaca());
}



}
