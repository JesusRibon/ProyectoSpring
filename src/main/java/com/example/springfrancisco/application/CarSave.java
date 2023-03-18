package com.example.springfrancisco.application;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.CarGetService;
import com.example.springfrancisco.domain.service.CarSaveService;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class CarSave {

  private final CarSaveService carSaveService;
  private final CarGetService carGetService;

  public Carro saveCar(Carro carro) {
    Carro carro1 = carGetService.getCar(carro.getPlaca());
    if (!Objects.isNull(carro1)) {
      log.info("EL CARRO CON PLACA {} YA ESTA REGISTRADO", carro.getPlaca());
      return null;
    }
    return carSaveService.save(carro);
  }
}
